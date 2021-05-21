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

enum class BlockLegacyMetadata(id: Int) {

    ANVIL_NORMAL(0),
    ANVIL_SLIGHTLY_DAMAGED(4),
    ANVIL_VERY_DAMAGED(8),
    BAMBOO_FLAG_THICK(1),
    BAMBOO_FLAG_READY(8),
    BAMBOO_LEAF_SIZE_SHIFT(1),
    BAMBOO_LEAF_SIZE_MASK(3),
    BARREL_FLAG_OPEN(8),
    BED_FLAG_HEAD(8),
    BED_FLAG_OCCUPIED(4),
    BEDROCK_FLAG_INFINIBURN(1),
    BREWING_STAND_FLAG_EAST(1),
    BREWING_STAND_FLAG_SOUTHWEST(2),
    BREWING_STAND_FLAG_NORTHWEST(4),
    BUTTON_FLAG_POWERED(8),
    CHEMISTRY_COMPOUND_CREATOR(0),
    CHEMISTRY_MATERIAL_REDUCER(4),
    CHEMISTRY_ELEMENT_CONSTRUCTOR(8),
    CHEMISTRY_LAB_TABLE(12),
    COLORED_TORCH_BP_BLUE(0),
    COLORED_TORCH_BP_PURPLE(8),
    COLORED_TORCH_RG_RED(0),
    COLORED_TORCH_RG_GREEN(8),
    CORAL_BLOCK_FLAG_DEAD(8),
    CORAL_FAN_EAST_WEST(0),
    CORAL_FAN_NORTH_SOUTH(1),
    CORAL_FAN_HANG_FLAG_DEAD(2),
    CORAL_FAN_HANG_TUBE(0),
    CORAL_FAN_HANG_BRAIN(1),
    CORAL_FAN_HANG2_BUBBLE(0),
    CORAL_FAN_HANG2_FIRE(1),
    CORAL_FAN_HANG3_HORN(0),
    CORAL_VARIANT_TUBE(0),
    CORAL_VARIANT_BRAIN(1),
    CORAL_VARIANT_BUBBLE(2),
    CORAL_VARIANT_FIRE(3),
    CORAL_VARIANT_HORN(4),
    DIRT_NORMAL(0),
    DIRT_COARSE(1),
    DOOR_FLAG_TOP(8),
    DOOR_BOTTOM_FLAG_OPEN(4),
    DOOR_TOP_FLAG_RIGHT(1),
    DOOR_TOP_FLAG_POWERED(2),
    DOUBLE_PLANT_SUNFLOWER(0),
    DOUBLE_PLANT_LILAC(1),
    DOUBLE_PLANT_TALLGRASS(2),
    DOUBLE_PLANT_LARGE_FERN(3),
    DOUBLE_PLANT_ROSE_BUSH(4),
    DOUBLE_PLANT_PEONY(5),
    DOUBLE_PLANT_FLAG_TOP(8),
    END_PORTAL_FRAME_FLAG_EYE(4),
    FENCE_GATE_FLAG_OPEN(4),
    FENCE_GATE_FLAG_IN_WALL(8),
    FLOWER_POPPY(0),
    FLOWER_BLUE_ORCHID(1),
    FLOWER_ALLIUM(2),
    FLOWER_AZURE_BLUET(3),
    FLOWER_RED_TULIP(4),
    FLOWER_ORANGE_TULIP(5),
    FLOWER_WHITE_TULIP(6),
    FLOWER_PINK_TULIP(7),
    FLOWER_OXEYE_DAISY(8),
    FLOWER_CORNFLOWER(9),
    FLOWER_LILY_OF_THE_VALLEY(10),
    FLOWER_POT_FLAG_OCCUPIED(1),
    HOPPER_FLAG_POWERED(8),
    INFESTED_STONE(0),
    INFESTED_COBBLESTONE(1),
    INFESTED_STONE_BRICK(2),
    INFESTED_STONE_BRICK_MOSSY(3),
    INFESTED_STONE_BRICK_CRACKED(4),
    INFESTED_STONE_BRICK_CHISELED(5),
    ITEM_FRAME_FLAG_HAS_MAP(4),
    LANTERN_FLAG_HANGING(1),
    LEAVES_FLAG_NO_DECAY(4),
    LEAVES_FLAG_CHECK_DECAY(8),
    LEVER_FLAG_POWERED(8),
    LIQUID_FLAG_FALLING(8),
    MUSHROOM_BLOCK_ALL_PORES(0),
    MUSHROOM_BLOCK_CAP_NORTHWEST_CORNER(1),
    MUSHROOM_BLOCK_CAP_NORTH_SIDE(2),
    MUSHROOM_BLOCK_CAP_NORTHEAST_CORNER(3),
    MUSHROOM_BLOCK_CAP_WEST_SIDE(4),
    MUSHROOM_BLOCK_CAP_TOP_ONLY(5),
    MUSHROOM_BLOCK_CAP_EAST_SIDE(6),
    MUSHROOM_BLOCK_CAP_SOUTHWEST_CORNER(7),
    MUSHROOM_BLOCK_CAP_SOUTH_SIDE(8),
    MUSHROOM_BLOCK_CAP_SOUTHEAST_CORNER(9),
    MUSHROOM_BLOCK_STEM(10),
    MUSHROOM_BLOCK_ALL_CAP(14),
    MUSHROOM_BLOCK_ALL_STEM(15),
    NETHER_PORTAL_AXIS_X(1),
    NETHER_PORTAL_AXIS_Z(2),
    NETHER_REACTOR_INACTIVE(0),
    NETHER_REACTOR_ACTIVE(1),
    NETHER_REACTOR_USED(2),
    PRESSURE_PLATE_FLAG_POWERED(1),
    PRISMARINE_NORMAL(0),
    PRISMARINE_DARK(1),
    PRISMARINE_BRICKS(2),
    PURPUR_NORMAL(0),
    PURPUR_PILLAR(2),
    QUARTZ_NORMAL(0),
    QUARTZ_CHISELED(1),
    QUARTZ_PILLAR(2),
    QUARTZ_SMOOTH(3),
    RAIL_STRAIGHT_NORTH_SOUTH(0),
    RAIL_STRAIGHT_EAST_WEST(1),
    RAIL_ASCENDING_EAST(2),
    RAIL_ASCENDING_WEST(3),
    RAIL_ASCENDING_NORTH(4),
    RAIL_ASCENDING_SOUTH(5),
    RAIL_CURVE_SOUTHEAST(6),
    RAIL_CURVE_SOUTHWEST(7),
    RAIL_CURVE_NORTHWEST(8),
    RAIL_CURVE_NORTHEAST(9),
    REDSTONE_COMPARATOR_FLAG_SUBTRACT(4),
    REDSTONE_COMPARATOR_FLAG_POWERED(8),
    REDSTONE_RAIL_FLAG_POWERED(8),
    SANDSTONE_NORMAL(0),
    SANDSTONE_CHISELED(1),
    SANDSTONE_CUT(2),
    SANDSTONE_SMOOTH(3),
    SAPLING_FLAG_READY(8),
    SEA_PICKLE_FLAG_NOT_UNDERWATER(4),
    SLAB_FLAG_UPPER(8),
    SPONGE_FLAG_WET(1),
    STAIR_FLAG_UPSIDE_DOWN(4),
    STONE_NORMAL(0),
    STONE_GRANITE(1),
    STONE_POLISHED_GRANITE(2),
    STONE_DIORITE(3),
    STONE_POLISHED_DIORITE(4),
    STONE_ANDESITE(5),
    STONE_POLISHED_ANDESITE(6),
    STONE_BRICK_NORMAL(0),
    STONE_BRICK_MOSSY(1),
    STONE_BRICK_CRACKED(2),
    STONE_BRICK_CHISELED(3),
    STONE_SLAB_SMOOTH_STONE(0),
    STONE_SLAB_SANDSTONE(1),
    STONE_SLAB_FAKE_WOODEN(2),
    STONE_SLAB_COBBLESTONE(3),
    STONE_SLAB_BRICK(4),
    STONE_SLAB_STONE_BRICK(5),
    STONE_SLAB_QUARTZ(6),
    STONE_SLAB_NETHER_BRICK(7),
    STONE_SLAB2_RED_SANDSTONE(0),
    STONE_SLAB2_PURPUR(1),
    STONE_SLAB2_PRISMARINE(2),
    STONE_SLAB2_DARK_PRISMARINE(3),
    STONE_SLAB2_PRISMARINE_BRICKS(4),
    STONE_SLAB2_MOSSY_COBBLESTONE(5),
    STONE_SLAB2_SMOOTH_SANDSTONE(6),
    STONE_SLAB2_RED_NETHER_BRICK(7),
    STONE_SLAB3_END_STONE_BRICK(0),
    STONE_SLAB3_SMOOTH_RED_SANDSTONE(1),
    STONE_SLAB3_POLISHED_ANDESITE(2),
    STONE_SLAB3_ANDESITE(3),
    STONE_SLAB3_DIORITE(4),
    STONE_SLAB3_POLISHED_DIORITE(5),
    STONE_SLAB3_GRANITE(6),
    STONE_SLAB3_POLISHED_GRANITE(7),
    STONE_SLAB4_MOSSY_STONE_BRICK(0),
    STONE_SLAB4_SMOOTH_QUARTZ(1),
    STONE_SLAB4_STONE(2),
    STONE_SLAB4_CUT_SANDSTONE(3),
    STONE_SLAB4_CUT_RED_SANDSTONE(4),
    TALLGRASS_NORMAL(1),
    TALLGRASS_FERN(2),
    TNT_FLAG_UNSTABLE(1),
    TNT_FLAG_UNDERWATER(2),
    TRAPDOOR_FLAG_UPPER(4),
    TRAPDOOR_FLAG_OPEN(8),
    TRIPWIRE_FLAG_TRIGGERED(1),
    TRIPWIRE_FLAG_SUSPENDED(2),
    TRIPWIRE_FLAG_CONNECTED(4),
    TRIPWIRE_FLAG_DISARMED(8),
    TRIPWIRE_HOOK_FLAG_CONNECTED(4),
    TRIPWIRE_HOOK_FLAG_POWERED(8),
    VINE_FLAG_SOUTH(1),
    VINE_FLAG_WEST(2),
    VINE_FLAG_NORTH(4),
    VINE_FLAG_EAST(8),
    WALL_COBBLESTONE(0),
    WALL_MOSSY_COBBLESTONE(1),
    WALL_GRANITE(2),
    WALL_DIORITE(3),
    WALL_ANDESITE(4),
    WALL_SANDSTONE(5),
    WALL_BRICK(6),
    WALL_STONE_BRICK(7),
    WALL_MOSSY_STONE_BRICK(8),
    WALL_NETHER_BRICK(9),
    WALL_END_STONE_BRICK(10),
    WALL_PRISMARINE(11),
    WALL_RED_SANDSTONE(12),
    WALL_RED_NETHER_BRICK(13)
}
