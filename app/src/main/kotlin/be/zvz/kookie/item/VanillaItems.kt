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
package be.zvz.kookie.item

enum class VanillaItems(val item: Item) {
    ACACIA_BOAT(ItemFactory.get(333, 4)),
    APPLE(ItemFactory.get(260)),
    ARROW(ItemFactory.get(262)),
    AWKWARD_POTION(ItemFactory.get(373, 4)),
    AWKWARD_SPLASH_POTION(ItemFactory.get(438, 4)),
    BAKED_POTATO(ItemFactory.get(393)),
    BEETROOT(ItemFactory.get(457)),
    BEETROOT_SEEDS(ItemFactory.get(458)),
    BEETROOT_SOUP(ItemFactory.get(459)),
    BIRCH_BOAT(ItemFactory.get(333, 2)),
    BLACK_BED(ItemFactory.get(355, 15)),
    BLACK_DYE(ItemFactory.get(351, 16)),
    BLAZE_POWDER(ItemFactory.get(377)),
    BLAZE_ROD(ItemFactory.get(369)),
    BLEACH(ItemFactory.get(451)),
    BLUE_BED(ItemFactory.get(355, 11)),
    BLUE_DYE(ItemFactory.get(351, 18)),
    BONE(ItemFactory.get(352)),
    BONE_MEAL(ItemFactory.get(351, 15)),
    BOOK(ItemFactory.get(340)),
    BOW(ItemFactory.get(261)),
    BOWL(ItemFactory.get(281)),
    BREAD(ItemFactory.get(297)),
    BRICK(ItemFactory.get(336)),
    BROWN_BED(ItemFactory.get(355, 12)),
    BROWN_DYE(ItemFactory.get(351, 17)),
    BUCKET(ItemFactory.get(325)),
    CARROT(ItemFactory.get(391)),
    CHAINMAIL_BOOTS(ItemFactory.get(305)),
    CHAINMAIL_CHESTPLATE(ItemFactory.get(303)),
    CHAINMAIL_HELMET(ItemFactory.get(302)),
    CHAINMAIL_LEGGINGS(ItemFactory.get(304)),
    CHARCOAL(ItemFactory.get(263, 1)),
    CHEMICAL_ALUMINIUM_OXIDE(ItemFactory.get(499, 13)),
    CHEMICAL_AMMONIA(ItemFactory.get(499, 36)),
    CHEMICAL_BARIUM_SULPHATE(ItemFactory.get(499, 20)),
    CHEMICAL_BENZENE(ItemFactory.get(499, 33)),
    CHEMICAL_BORON_TRIOXIDE(ItemFactory.get(499, 14)),
    CHEMICAL_CALCIUM_BROMIDE(ItemFactory.get(499, 7)),
    CHEMICAL_CALCIUM_CHLORIDE(ItemFactory.get(499, 25)),
    CHEMICAL_CERIUM_CHLORIDE(ItemFactory.get(499, 23)),
    CHEMICAL_CHARCOAL(ItemFactory.get(499, 11)),
    CHEMICAL_CRUDE_OIL(ItemFactory.get(499, 29)),
    CHEMICAL_GLUE(ItemFactory.get(499, 27)),
    CHEMICAL_HYDROGEN_PEROXIDE(ItemFactory.get(499, 35)),
    CHEMICAL_HYPOCHLORITE(ItemFactory.get(499, 28)),
    CHEMICAL_INK(ItemFactory.get(499, 34)),
    CHEMICAL_IRON_SULPHIDE(ItemFactory.get(499, 4)),
    CHEMICAL_LATEX(ItemFactory.get(499, 30)),
    CHEMICAL_LITHIUM_HYDRIDE(ItemFactory.get(499, 5)),
    CHEMICAL_LUMINOL(ItemFactory.get(499, 10)),
    CHEMICAL_MAGNESIUM_NITRATE(ItemFactory.get(499, 3)),
    CHEMICAL_MAGNESIUM_OXIDE(ItemFactory.get(499, 8)),
    CHEMICAL_MAGNESIUM_SALTS(ItemFactory.get(499, 18)),
    CHEMICAL_MERCURIC_CHLORIDE(ItemFactory.get(499, 22)),
    CHEMICAL_POLYETHYLENE(ItemFactory.get(499, 16)),
    CHEMICAL_POTASSIUM_CHLORIDE(ItemFactory.get(499, 21)),
    CHEMICAL_POTASSIUM_IODIDE(ItemFactory.get(499, 31)),
    CHEMICAL_RUBBISH(ItemFactory.get(499, 17)),
    CHEMICAL_SALT(ItemFactory.get(499)),
    CHEMICAL_SOAP(ItemFactory.get(499, 15)),
    CHEMICAL_SODIUM_ACETATE(ItemFactory.get(499, 9)),
    CHEMICAL_SODIUM_FLUORIDE(ItemFactory.get(499, 32)),
    CHEMICAL_SODIUM_HYDRIDE(ItemFactory.get(499, 6)),
    CHEMICAL_SODIUM_HYDROXIDE(ItemFactory.get(499, 2)),
    CHEMICAL_SODIUM_HYPOCHLORITE(ItemFactory.get(499, 37)),
    CHEMICAL_SODIUM_OXIDE(ItemFactory.get(499, 1)),
    CHEMICAL_SUGAR(ItemFactory.get(499, 12)),
    CHEMICAL_SULPHATE(ItemFactory.get(499, 19)),
    CHEMICAL_TUNGSTEN_CHLORIDE(ItemFactory.get(499, 24)),
    CHEMICAL_WATER(ItemFactory.get(499, 26)),
    CHORUS_FRUIT(ItemFactory.get(432)),
    CLAY(ItemFactory.get(337)),
    CLOCK(ItemFactory.get(347)),
    CLOWNFISH(ItemFactory.get(461)),
    COAL(ItemFactory.get(263)),
    COCOA_BEANS(ItemFactory.get(351, 3)),
    COMPASS(ItemFactory.get(345)),
    COOKED_CHICKEN(ItemFactory.get(366)),
    COOKED_FISH(ItemFactory.get(350)),
    COOKED_MUTTON(ItemFactory.get(424)),
    COOKED_PORKCHOP(ItemFactory.get(320)),
    COOKED_RABBIT(ItemFactory.get(412)),
    COOKED_SALMON(ItemFactory.get(463)),
    COOKIE(ItemFactory.get(357)),
    CREEPER_HEAD(ItemFactory.get(397, 4)),
    CYAN_BED(ItemFactory.get(355, 9)),
    CYAN_DYE(ItemFactory.get(351, 6)),
    DARK_OAK_BOAT(ItemFactory.get(333, 5)),
    DIAMOND(ItemFactory.get(264)),
    DIAMOND_AXE(ItemFactory.get(279)),
    DIAMOND_BOOTS(ItemFactory.get(313)),
    DIAMOND_CHESTPLATE(ItemFactory.get(311)),
    DIAMOND_HELMET(ItemFactory.get(310)),
    DIAMOND_HOE(ItemFactory.get(293)),
    DIAMOND_LEGGINGS(ItemFactory.get(312)),
    DIAMOND_PICKAXE(ItemFactory.get(278)),
    DIAMOND_SHOVEL(ItemFactory.get(277)),
    DIAMOND_SWORD(ItemFactory.get(276)),
    DRAGON_BREATH(ItemFactory.get(437)),
    DRAGON_HEAD(ItemFactory.get(397, 5)),
    DRIED_KELP(ItemFactory.get(464)),
    EGG(ItemFactory.get(344)),
    EMERALD(ItemFactory.get(388)),
    ENCHANTED_GOLDEN_APPLE(ItemFactory.get(466)),
    ENDER_PEARL(ItemFactory.get(368)),
    EXPERIENCE_BOTTLE(ItemFactory.get(384)),
    FEATHER(ItemFactory.get(288)),
    FERMENTED_SPIDER_EYE(ItemFactory.get(376)),
    FIRE_RESISTANCE_POTION(ItemFactory.get(373, 12)),
    FIRE_RESISTANCE_SPLASH_POTION(ItemFactory.get(438, 12)),
    FISHING_ROD(ItemFactory.get(346)),
    FLINT(ItemFactory.get(318)),
    FLINT_AND_STEEL(ItemFactory.get(259)),
    GHAST_TEAR(ItemFactory.get(370)),
    GLASS_BOTTLE(ItemFactory.get(374)),
    GLISTERING_MELON(ItemFactory.get(382)),
    GLOWSTONE_DUST(ItemFactory.get(348)),
    GOLD_INGOT(ItemFactory.get(266)),
    GOLD_NUGGET(ItemFactory.get(371)),
    GOLDEN_APPLE(ItemFactory.get(322)),
    GOLDEN_AXE(ItemFactory.get(286)),
    GOLDEN_BOOTS(ItemFactory.get(317)),
    GOLDEN_CARROT(ItemFactory.get(396)),
    GOLDEN_CHESTPLATE(ItemFactory.get(315)),
    GOLDEN_HELMET(ItemFactory.get(314)),
    GOLDEN_HOE(ItemFactory.get(294)),
    GOLDEN_LEGGINGS(ItemFactory.get(316)),
    GOLDEN_PICKAXE(ItemFactory.get(285)),
    GOLDEN_SHOVEL(ItemFactory.get(284)),
    GOLDEN_SWORD(ItemFactory.get(283)),
    GRAY_BED(ItemFactory.get(355, 7)),
    GRAY_DYE(ItemFactory.get(351, 8)),
    GREEN_BED(ItemFactory.get(355, 13)),
    GREEN_DYE(ItemFactory.get(351, 2)),
    GUNPOWDER(ItemFactory.get(289)),
    HARMING_POTION(ItemFactory.get(373, 23)),
    HARMING_SPLASH_POTION(ItemFactory.get(438, 23)),
    HEALING_POTION(ItemFactory.get(373, 21)),
    HEALING_SPLASH_POTION(ItemFactory.get(438, 21)),
    HEART_OF_THE_SEA(ItemFactory.get(467)),
    INK_SAC(ItemFactory.get(351)),
    INVISIBILITY_POTION(ItemFactory.get(373, 7)),
    INVISIBILITY_SPLASH_POTION(ItemFactory.get(438, 7)),
    IRON_AXE(ItemFactory.get(258)),
    IRON_BOOTS(ItemFactory.get(309)),
    IRON_CHESTPLATE(ItemFactory.get(307)),
    IRON_HELMET(ItemFactory.get(306)),
    IRON_HOE(ItemFactory.get(292)),
    IRON_INGOT(ItemFactory.get(265)),
    IRON_LEGGINGS(ItemFactory.get(308)),
    IRON_NUGGET(ItemFactory.get(452)),
    IRON_PICKAXE(ItemFactory.get(257)),
    IRON_SHOVEL(ItemFactory.get(256)),
    IRON_SWORD(ItemFactory.get(267)),
    JUNGLE_BOAT(ItemFactory.get(333, 3)),
    LAPIS_LAZULI(ItemFactory.get(351, 4)),
    LAVA_BUCKET(ItemFactory.get(325, 10)),
    LEAPING_POTION(ItemFactory.get(373, 9)),
    LEAPING_SPLASH_POTION(ItemFactory.get(438, 9)),
    LEATHER(ItemFactory.get(334)),
    LEATHER_BOOTS(ItemFactory.get(301)),
    LEATHER_CAP(ItemFactory.get(298)),
    LEATHER_PANTS(ItemFactory.get(300)),
    LEATHER_TUNIC(ItemFactory.get(299)),
    LIGHT_BLUE_BED(ItemFactory.get(355, 3)),
    LIGHT_BLUE_DYE(ItemFactory.get(351, 12)),
    LIGHT_GRAY_BED(ItemFactory.get(355, 8)),
    LIGHT_GRAY_DYE(ItemFactory.get(351, 7)),
    LIME_BED(ItemFactory.get(355, 5)),
    LIME_DYE(ItemFactory.get(351, 10)),
    LONG_FIRE_RESISTANCE_POTION(ItemFactory.get(373, 13)),
    LONG_FIRE_RESISTANCE_SPLASH_POTION(ItemFactory.get(438, 13)),
    LONG_INVISIBILITY_POTION(ItemFactory.get(373, 8)),
    LONG_INVISIBILITY_SPLASH_POTION(ItemFactory.get(438, 8)),
    LONG_LEAPING_POTION(ItemFactory.get(373, 10)),
    LONG_LEAPING_SPLASH_POTION(ItemFactory.get(438, 10)),
    LONG_MUNDANE_POTION(ItemFactory.get(373, 2)),
    LONG_MUNDANE_SPLASH_POTION(ItemFactory.get(438, 2)),
    LONG_NIGHT_VISION_POTION(ItemFactory.get(373, 6)),
    LONG_NIGHT_VISION_SPLASH_POTION(ItemFactory.get(438, 6)),
    LONG_POISON_POTION(ItemFactory.get(373, 26)),
    LONG_POISON_SPLASH_POTION(ItemFactory.get(438, 26)),
    LONG_REGENERATION_POTION(ItemFactory.get(373, 29)),
    LONG_REGENERATION_SPLASH_POTION(ItemFactory.get(438, 29)),
    LONG_SLOW_FALLING_POTION(ItemFactory.get(373, 41)),
    LONG_SLOW_FALLING_SPLASH_POTION(ItemFactory.get(438, 41)),
    LONG_SLOWNESS_POTION(ItemFactory.get(373, 18)),
    LONG_SLOWNESS_SPLASH_POTION(ItemFactory.get(438, 18)),
    LONG_STRENGTH_POTION(ItemFactory.get(373, 32)),
    LONG_STRENGTH_SPLASH_POTION(ItemFactory.get(438, 32)),
    LONG_SWIFTNESS_POTION(ItemFactory.get(373, 15)),
    LONG_SWIFTNESS_SPLASH_POTION(ItemFactory.get(438, 15)),
    LONG_TURTLE_MASTER_POTION(ItemFactory.get(373, 38)),
    LONG_TURTLE_MASTER_SPLASH_POTION(ItemFactory.get(438, 38)),
    LONG_WATER_BREATHING_POTION(ItemFactory.get(373, 20)),
    LONG_WATER_BREATHING_SPLASH_POTION(ItemFactory.get(438, 20)),
    LONG_WEAKNESS_POTION(ItemFactory.get(373, 35)),
    LONG_WEAKNESS_SPLASH_POTION(ItemFactory.get(438, 35)),
    MAGENTA_BED(ItemFactory.get(355, 2)),
    MAGENTA_DYE(ItemFactory.get(351, 13)),
    MAGMA_CREAM(ItemFactory.get(378)),
    MELON(ItemFactory.get(360)),
    MELON_SEEDS(ItemFactory.get(362)),
    MILK_BUCKET(ItemFactory.get(325, 1)),
    MINECART(ItemFactory.get(328)),
    MUNDANE_POTION(ItemFactory.get(373, 1)),
    MUNDANE_SPLASH_POTION(ItemFactory.get(438, 1)),
    MUSHROOM_STEW(ItemFactory.get(282)),
    NAUTILUS_SHELL(ItemFactory.get(465)),
    NETHER_BRICK(ItemFactory.get(405)),
    NETHER_QUARTZ(ItemFactory.get(406)),
    NETHER_STAR(ItemFactory.get(399)),
    NIGHT_VISION_POTION(ItemFactory.get(373, 5)),
    NIGHT_VISION_SPLASH_POTION(ItemFactory.get(438, 5)),
    OAK_BOAT(ItemFactory.get(333)),
    ORANGE_BED(ItemFactory.get(355, 1)),
    ORANGE_DYE(ItemFactory.get(351, 14)),
    PAINTING(ItemFactory.get(321)),
    PAPER(ItemFactory.get(339)),
    PINK_BED(ItemFactory.get(355, 6)),
    PINK_DYE(ItemFactory.get(351, 9)),
    PLAYER_HEAD(ItemFactory.get(397, 3)),
    POISON_POTION(ItemFactory.get(373, 25)),
    POISON_SPLASH_POTION(ItemFactory.get(438, 25)),
    POISONOUS_POTATO(ItemFactory.get(394)),
    POPPED_CHORUS_FRUIT(ItemFactory.get(433)),
    POTATO(ItemFactory.get(392)),
    PRISMARINE_CRYSTALS(ItemFactory.get(422)),
    PRISMARINE_SHARD(ItemFactory.get(409)),
    PUFFERFISH(ItemFactory.get(462)),
    PUMPKIN_PIE(ItemFactory.get(400)),
    PUMPKIN_SEEDS(ItemFactory.get(361)),
    PURPLE_BED(ItemFactory.get(355, 10)),
    PURPLE_DYE(ItemFactory.get(351, 5)),
    RABBIT_FOOT(ItemFactory.get(414)),
    RABBIT_HIDE(ItemFactory.get(415)),
    RABBIT_STEW(ItemFactory.get(413)),
    RAW_BEEF(ItemFactory.get(363)),
    RAW_CHICKEN(ItemFactory.get(365)),
    RAW_FISH(ItemFactory.get(349)),
    RAW_MUTTON(ItemFactory.get(423)),
    RAW_PORKCHOP(ItemFactory.get(319)),
    RAW_RABBIT(ItemFactory.get(411)),
    RAW_SALMON(ItemFactory.get(460)),
    RECORD_11(ItemFactory.get(510)),
    RECORD_13(ItemFactory.get(500)),
    RECORD_BLOCKS(ItemFactory.get(502)),
    RECORD_CAT(ItemFactory.get(501)),
    RECORD_CHIRP(ItemFactory.get(503)),
    RECORD_FAR(ItemFactory.get(504)),
    RECORD_MALL(ItemFactory.get(505)),
    RECORD_MELLOHI(ItemFactory.get(506)),
    RECORD_STAL(ItemFactory.get(507)),
    RECORD_STRAD(ItemFactory.get(508)),
    RECORD_WAIT(ItemFactory.get(511)),
    RECORD_WARD(ItemFactory.get(509)),
    RED_BED(ItemFactory.get(355, 14)),
    RED_DYE(ItemFactory.get(351, 1)),
    REDSTONE_DUST(ItemFactory.get(331)),
    REGENERATION_POTION(ItemFactory.get(373, 28)),
    REGENERATION_SPLASH_POTION(ItemFactory.get(438, 28)),
    ROTTEN_FLESH(ItemFactory.get(367)),
    SCUTE(ItemFactory.get(468)),
    SHEARS(ItemFactory.get(359)),
    SHULKER_SHELL(ItemFactory.get(445)),
    SKELETON_SKULL(ItemFactory.get(397)),
    SLIMEBALL(ItemFactory.get(341)),
    SLOW_FALLING_POTION(ItemFactory.get(373, 40)),
    SLOW_FALLING_SPLASH_POTION(ItemFactory.get(438, 40)),
    SLOWNESS_POTION(ItemFactory.get(373, 17)),
    SLOWNESS_SPLASH_POTION(ItemFactory.get(438, 17)),
    SNOWBALL(ItemFactory.get(332)),
    SPIDER_EYE(ItemFactory.get(375)),
    SPRUCE_BOAT(ItemFactory.get(333, 1)),
    SQUID_SPAWN_EGG(ItemFactory.get(383, 17)),
    STEAK(ItemFactory.get(364)),
    STICK(ItemFactory.get(280)),
    STONE_AXE(ItemFactory.get(275)),
    STONE_HOE(ItemFactory.get(291)),
    STONE_PICKAXE(ItemFactory.get(274)),
    STONE_SHOVEL(ItemFactory.get(273)),
    STONE_SWORD(ItemFactory.get(272)),
    STRENGTH_POTION(ItemFactory.get(373, 31)),
    STRENGTH_SPLASH_POTION(ItemFactory.get(438, 31)),
    STRING(ItemFactory.get(287)),
    STRONG_HARMING_POTION(ItemFactory.get(373, 24)),
    STRONG_HARMING_SPLASH_POTION(ItemFactory.get(438, 24)),
    STRONG_HEALING_POTION(ItemFactory.get(373, 22)),
    STRONG_HEALING_SPLASH_POTION(ItemFactory.get(438, 22)),
    STRONG_LEAPING_POTION(ItemFactory.get(373, 11)),
    STRONG_LEAPING_SPLASH_POTION(ItemFactory.get(438, 11)),
    STRONG_POISON_POTION(ItemFactory.get(373, 27)),
    STRONG_POISON_SPLASH_POTION(ItemFactory.get(438, 27)),
    STRONG_REGENERATION_POTION(ItemFactory.get(373, 30)),
    STRONG_REGENERATION_SPLASH_POTION(ItemFactory.get(438, 30)),
    STRONG_STRENGTH_POTION(ItemFactory.get(373, 33)),
    STRONG_STRENGTH_SPLASH_POTION(ItemFactory.get(438, 33)),
    STRONG_SWIFTNESS_POTION(ItemFactory.get(373, 16)),
    STRONG_SWIFTNESS_SPLASH_POTION(ItemFactory.get(438, 16)),
    STRONG_TURTLE_MASTER_POTION(ItemFactory.get(373, 39)),
    STRONG_TURTLE_MASTER_SPLASH_POTION(ItemFactory.get(438, 39)),
    SUGAR(ItemFactory.get(353)),
    SWIFTNESS_POTION(ItemFactory.get(373, 14)),
    SWIFTNESS_SPLASH_POTION(ItemFactory.get(438, 14)),
    THICK_POTION(ItemFactory.get(373, 3)),
    THICK_SPLASH_POTION(ItemFactory.get(438, 3)),
    TOTEM(ItemFactory.get(450)),
    TURTLE_MASTER_POTION(ItemFactory.get(373, 37)),
    TURTLE_MASTER_SPLASH_POTION(ItemFactory.get(438, 37)),
    VILLAGER_SPAWN_EGG(ItemFactory.get(383, 15)),
    WATER_BREATHING_POTION(ItemFactory.get(373, 19)),
    WATER_BREATHING_SPLASH_POTION(ItemFactory.get(438, 19)),
    WATER_BUCKET(ItemFactory.get(325, 8)),
    WATER_POTION(ItemFactory.get(373)),
    WATER_SPLASH_POTION(ItemFactory.get(438)),
    WEAKNESS_POTION(ItemFactory.get(373, 34)),
    WEAKNESS_SPLASH_POTION(ItemFactory.get(438, 34)),
    WHEAT(ItemFactory.get(296)),
    WHEAT_SEEDS(ItemFactory.get(295)),
    WHITE_BED(ItemFactory.get(355)),
    WHITE_DYE(ItemFactory.get(351, 19)),
    WITHER_POTION(ItemFactory.get(373, 36)),
    WITHER_SKELETON_SKULL(ItemFactory.get(397, 1)),
    WITHER_SPLASH_POTION(ItemFactory.get(438, 36)),
    WOODEN_AXE(ItemFactory.get(271)),
    WOODEN_HOE(ItemFactory.get(290)),
    WOODEN_PICKAXE(ItemFactory.get(270)),
    WOODEN_SHOVEL(ItemFactory.get(269)),
    WOODEN_SWORD(ItemFactory.get(268)),
    WRITABLE_BOOK(ItemFactory.get(386)),
    WRITTEN_BOOK(ItemFactory.get(387)),
    YELLOW_BED(ItemFactory.get(355, 4)),
    YELLOW_DYE(ItemFactory.get(351, 11)),
    ZOMBIE_HEAD(ItemFactory.get(397, 2)),
    ZOMBIE_SPAWN_EGG(ItemFactory.get(383, 32)),
}
