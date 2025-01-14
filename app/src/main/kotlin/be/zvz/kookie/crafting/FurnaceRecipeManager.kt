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
package be.zvz.kookie.crafting

import be.zvz.kookie.item.Item
import com.koloboke.collect.map.hash.HashObjObjMaps

class FurnaceRecipeManager {

    val furnaceRecipes: MutableMap<String, FurnaceRecipe> = HashObjObjMaps.newMutableMap()

    val recipeRegisteredCallbacks: MutableList<(FurnaceRecipe) -> Unit> = mutableListOf()

    fun register(recipe: FurnaceRecipe) {
        val input = recipe.ingredient
        val hash = "${input.getId()}:" + if (input.hasAnyDamageValue()) "?" else input.getMeta().toString()

        furnaceRecipes[hash] = recipe

        recipeRegisteredCallbacks.forEach {
            it(recipe)
        }
    }

    fun match(input: Item): FurnaceRecipe? {
        val hash = "${input.getId()}:" + if (input.hasAnyDamageValue()) "?" else input.getMeta().toString()
        return furnaceRecipes[hash]
    }
}
