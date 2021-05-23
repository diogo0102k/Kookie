package be.zvz.kookie.network.mcpe.convert

import be.zvz.kookie.network.mcpe.protocol.ItemTypeEntry
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.afterburner.AfterburnerModule
import com.fasterxml.jackson.module.kotlin.jacksonMapperBuilder
import com.koloboke.collect.map.hash.HashIntObjMaps
import com.koloboke.collect.map.hash.HashObjObjMaps
import java.lang.NumberFormatException

class ItemTypeDictionary private constructor(val itemTypes: List<ItemTypeEntry>) {
    private val stringToIntMap: MutableMap<String, Int> = HashObjObjMaps.newMutableMap()
    private val intToStringIdMap: MutableMap<Int, String> = HashIntObjMaps.newMutableMap()
    companion object {
        private val jsonMapper: ObjectMapper = jacksonMapperBuilder()
            .addModule(AfterburnerModule())
            .build()
        private val instance: ItemTypeDictionary = make()
        fun getInstance(): ItemTypeDictionary {
            return instance
        }

        private fun make(): ItemTypeDictionary {
            val data = jsonMapper.readValue(
                this::class.java.getResourceAsStream("vanilla/required_item_list.json"),
                object : TypeReference<Map<String, Map<String, String>>>() {}
            )

            val itemTypes: MutableList<ItemTypeEntry> = mutableListOf()
            data.forEach { (name, entry) ->
                val runtimeId: Int
                val componentBased: Boolean
                try {
                    runtimeId = entry.getValue("runtime_id").toInt()
                    componentBased = entry.getValue("component_based").toBoolean()
                } catch (ignored: NumberFormatException) {
                    return@forEach
                } catch (ignored: NoSuchElementException) {
                    return@forEach
                }

                itemTypes.add(ItemTypeEntry(name, runtimeId, componentBased))
            }
            return ItemTypeDictionary(itemTypes)
        }
    }
    init {
        itemTypes.forEach { type ->
            stringToIntMap[type.stringId] = type.numericId
            intToStringIdMap[type.numericId] = type.stringId
        }
    }
    fun getEntires(): List<ItemTypeEntry> = itemTypes
    fun fromStringId(id: String): Int {
        return stringToIntMap.getValue(id)
    }
    fun fromIntId(id: Int): String {
        return intToStringIdMap.getValue(id)
    }
}