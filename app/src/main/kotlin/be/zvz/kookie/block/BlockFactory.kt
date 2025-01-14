/**
 *
 * _  __           _    _
 * | |/ /___   ___ | | _(_) ___
 * | ' // _ \ / _ \| |/ / |/ _ \
 * | . \ (_) | (_) |   <| |  __/
 * |_|\_\___/ \___/|_|\_\_|\___|
 *
 * A server software for Minecraft: Bedrock Edition
 *
 * Copyright (C) 2021 organization Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */
package be.zvz.kookie.block

import com.koloboke.collect.map.hash.HashIntFloatMaps
import com.koloboke.collect.map.hash.HashIntIntMaps
import com.koloboke.collect.map.hash.HashIntObjMaps
import be.zvz.kookie.block.BlockIdentifier as BID
import be.zvz.kookie.block.BlockLegacyIds as Ids

object BlockFactory {
    private val fullList: MutableMap<Int, Block> = HashIntObjMaps.newMutableMap()
    var light: MutableMap<Int, Int> = HashIntIntMaps.newMutableMap()
    var lightFilter: MutableMap<Int, Int> = HashIntIntMaps.newMutableMap()
    var blocksDirectSkyLight: MutableMap<Int, Boolean> = HashIntObjMaps.newMutableMap()
    var blastResistance: MutableMap<Int, Float> = HashIntFloatMaps.newMutableMap()

    init {
        /*val railBreakInfo = BlockBreakInfo(0.7f)
        register(ActivatorRail(BID(Ids.ACTIVATOR_RAIL.id, 0), "Activator Rail", railBreakInfo))*/
        register(Air(BID(Ids.AIR.id, 0), "Air", BlockBreakInfo.indestructible(-1f)))
        TODO("Add Blocks")
    }

    @JvmStatic
    @JvmOverloads
    fun register(block: Block, override: Boolean = false) {
        val variant = block.idInfo.variant

        val stateMask = block.getStateBitmask()
        if ((variant and stateMask) != 0) {
            throw IllegalArgumentException("Block variant collides with state bitmask")
        }

        block.idInfo.getAllBlockIds().forEach { id ->
            if (!override) assertRegisterValid(block, id, variant)
            for (meta in variant until (variant or stateMask)) {
                if (meta and stateMask.inv() != variant) {
                    continue
                }
                if (!override) assertRegisterValid(block, id, meta)

                val index = id shl 4 or meta
                val v = block.clone().apply { readStateFromData(id, meta) }
                if (v.getFullId() != index) {
                    // if the fullID comes back different, this is a broken state that we can't rely on; map it to default
                    fillStaticArrays(index, block)
                } else {
                    fillStaticArrays(index, v)
                }
            }
        }
    }

    private fun assertRegisterValid(block: Block, id: Int, variant: Int) {
        if (isRegistered(id, variant)) {
            throw IllegalArgumentException(
                "Block registration ${block::class} has states which conflict with other blocks"
            )
        }
    }

    @JvmStatic
    fun remap(id: Int, meta: Int, block: Block) {
        if (isRegistered(id, meta)) {
            val index = id shl 4 or meta
            val existing = fullList[index]
            if (existing !== null && existing.getFullId() == index) {
                throw IllegalArgumentException("$id:$meta is already mapped")
            } else {
                // if it's not a match, this was already remapped for some reason remapping overwrites are OK
            }
        }
        fillStaticArrays((id shl 4) or meta, block)
    }

    private fun fillStaticArrays(index: Int, block: Block) {
        fullList[index] = block
        light[index] = block.getLightLevel()
        lightFilter[index] = 15.coerceAtMost(block.getLightFilter() + 1) // opacity plus 1 standard light filter
        blocksDirectSkyLight[index] = block.blocksDirectSkyLight()
        blastResistance[index] = block.breakInfo.blastResistance
    }

    /**
     * @deprecated This method should ONLY be used for deserializing data, e.g. from a config or database. For all other
     * purposes, use VanillaBlocks.
     * @see VanillaBlocks
     *
     * Deserializes a block from the provided legacy ID and legacy meta.
     */
    @JvmStatic
    @JvmOverloads
    fun get(id: Int, meta: Int = 0): Block {
        if (meta !in 0..0xf) {
            throw IllegalArgumentException("Block meta value meta is out of bounds")
        }

        var block: Block? = null
        val index = (id shl 4) or meta
        fullList[index]?.let {
            block = it.clone()
        }
        return block ?: UnknownBlock(BID(id, meta), BlockBreakInfo.instant())
    }

    fun fromFullBlock(fullState: Int): Block = get(fullState shr 4, fullState and 0xf)

    @JvmStatic
    @JvmOverloads
    fun isRegistered(id: Int, meta: Int = 0): Boolean = fullList[id shl 4 or meta]?.takeIf { it !is UnknownBlock } !== null

    @Deprecated("In PMMP, it is used to fetch only blocks without null ")
    fun getAllKnownStates() = fullList.toList()
}
