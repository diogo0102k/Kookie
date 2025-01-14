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
package be.zvz.kookie.network.mcpe.protocol

class ProtocolInfo {

    companion object {
        const val CURRENT_PROTOCOL = 440

        const val MINECRAFT_VERSION_NETWORK = "1.17.0"
    }

    enum class IDS(val id: Int) {
        UNKNOWN(-1),
        LOGIN_PACKET(1),
        PLAY_STATUS_PACKET(2),
        SERVER_TO_CLIENT_HANDSHAKE_PACKET(3),
        CLIENT_TO_SERVER_HANDSHAKE_PACKET(4),
        DISCONNECT_PACKET(5),
        RESOURCE_PACKS_INFO_PACKET(6),
        RESOURCE_PACK_STACK_PACKET(7),
        RESOURCE_PACK_CLIENT_RESPONSE_PACKET(8),
        TEXT_PACKET(9),
        SET_TIME_PACKET(10),
        START_GAME_PACKET(11),
        ADD_PLAYER_PACKET(12),
        ADD_ACTOR_PACKET(13),
        REMOVE_ACTOR_PACKET(14),
        ADD_ITEM_ACTOR_PACKET(15),
        TAKE_ITEM_ACTOR_PACKET(17),
        MOVE_ACTOR_ABSOLUTE_PACKET(18),
        MOVE_PLAYER_PACKET(19),
        RIDER_JUMP_PACKET(20),
        UPDATE_BLOCK_PACKET(21),
        ADD_PAINTING_PACKET(22),
        TICK_SYNC_PACKET(23),
        LEVEL_SOUND_EVENT_PACKET_V1(24),
        LEVEL_EVENT_PACKET(25),
        BLOCK_EVENT_PACKET(26),
        ACTOR_EVENT_PACKET(27),
        MOB_EFFECT_PACKET(28),
        UPDATE_ATTRIBUTES_PACKET(29),
        INVENTORY_TRANSACTION_PACKET(30),
        MOB_EQUIPMENT_PACKET(31),
        MOB_ARMOR_EQUIPMENT_PACKET(32),
        INTERACT_PACKET(33),
        BLOCK_PICK_REQUEST_PACKET(34),
        ACTOR_PICK_REQUEST_PACKET(35),
        PLAYER_ACTION_PACKET(36),
        HURT_ARMOR_PACKET(38),
        SET_ACTOR_DATA_PACKET(39),
        SET_ACTOR_MOTION_PACKET(40),
        SET_ACTOR_LINK_PACKET(41),
        SET_HEALTH_PACKET(42),
        SET_SPAWN_POSITION_PACKET(43),
        ANIMATE_PACKET(44),
        RESPAWN_PACKET(45),
        CONTAINER_OPEN_PACKET(46),
        CONTAINER_CLOSE_PACKET(47),
        PLAYER_HOTBAR_PACKET(48),
        INVENTORY_CONTENT_PACKET(49),
        INVENTORY_SLOT_PACKET(50),
        CONTAINER_SET_DATA_PACKET(51),
        CRAFTING_DATA_PACKET(52),
        CRAFTING_EVENT_PACKET(53),
        GUI_DATA_PICK_ITEM_PACKET(54),
        ADVENTURE_SETTINGS_PACKET(55),
        BLOCK_ACTOR_DATA_PACKET(56),
        PLAYER_INPUT_PACKET(57),
        LEVEL_CHUNK_PACKET(58),
        SET_COMMANDS_ENABLED_PACKET(59),
        SET_DIFFICULTY_PACKET(60),
        CHANGE_DIMENSION_PACKET(61),
        SET_PLAYER_GAME_TYPE_PACKET(62),
        PLAYER_LIST_PACKET(63),
        SIMPLE_EVENT_PACKET(64),
        EVENT_PACKET(65),
        SPAWN_EXPERIENCE_ORB_PACKET(66),
        CLIENTBOUND_MAP_ITEM_DATA_PACKET(67),
        MAP_INFO_REQUEST_PACKET(68),
        REQUEST_CHUNK_RADIUS_PACKET(69),
        CHUNK_RADIUS_UPDATED_PACKET(70),
        ITEM_FRAME_DROP_ITEM_PACKET(71),
        GAME_RULES_CHANGED_PACKET(72),
        CAMERA_PACKET(73),
        BOSS_EVENT_PACKET(74),
        SHOW_CREDITS_PACKET(75),
        AVAILABLE_COMMANDS_PACKET(76),
        COMMAND_REQUEST_PACKET(77),
        COMMAND_BLOCK_UPDATE_PACKET(78),
        COMMAND_OUTPUT_PACKET(79),
        UPDATE_TRADE_PACKET(80),
        UPDATE_EQUIP_PACKET(81),
        RESOURCE_PACK_DATA_INFO_PACKET(82),
        RESOURCE_PACK_CHUNK_DATA_PACKET(83),
        RESOURCE_PACK_CHUNK_REQUEST_PACKET(84),
        TRANSFER_PACKET(85),
        PLAY_SOUND_PACKET(86),
        STOP_SOUND_PACKET(87),
        SET_TITLE_PACKET(88),
        ADD_BEHAVIOR_TREE_PACKET(89),
        STRUCTURE_BLOCK_UPDATE_PACKET(90),
        SHOW_STORE_OFFER_PACKET(91),
        PURCHASE_RECEIPT_PACKET(92),
        PLAYER_SKIN_PACKET(93),
        SUB_CLIENT_LOGIN_PACKET(94),
        AUTOMATION_CLIENT_CONNECT_PACKET(95),
        SET_LAST_HURT_BY_PACKET(96),
        BOOK_EDIT_PACKET(97),
        NPC_REQUEST_PACKET(98),
        PHOTO_TRANSFER_PACKET(99),
        MODAL_FORM_REQUEST_PACKET(100),
        MODAL_FORM_RESPONSE_PACKET(101),
        SERVER_SETTINGS_REQUEST_PACKET(102),
        SERVER_SETTINGS_RESPONSE_PACKET(103),
        SHOW_PROFILE_PACKET(104),
        SET_DEFAULT_GAME_TYPE_PACKET(105),
        REMOVE_OBJECTIVE_PACKET(106),
        SET_DISPLAY_OBJECTIVE_PACKET(107),
        SET_SCORE_PACKET(108),
        LAB_TABLE_PACKET(109),
        UPDATE_BLOCK_SYNCED_PACKET(110),
        MOVE_ACTOR_DELTA_PACKET(111),
        SET_SCOREBOARD_IDENTITY_PACKET(112),
        SET_LOCAL_PLAYER_AS_INITIALIZED_PACKET(113),
        UPDATE_SOFT_ENUM_PACKET(114),
        NETWORK_STACK_LATENCY_PACKET(115),
        SCRIPT_CUSTOM_EVENT_PACKET(117),
        SPAWN_PARTICLE_EFFECT_PACKET(118),
        AVAILABLE_ACTOR_IDENTIFIERS_PACKET(119),
        LEVEL_SOUND_EVENT_PACKET_V2(120),
        NETWORK_CHUNK_PUBLISHER_UPDATE_PACKET(121),
        BIOME_DEFINITION_LIST_PACKET(122),
        LEVEL_SOUND_EVENT_PACKET(123),
        LEVEL_EVENT_GENERIC_PACKET(124),
        LECTERN_UPDATE_PACKET(125),
        ADD_ENTITY_PACKET(127),
        REMOVE_ENTITY_PACKET(128),
        CLIENT_CACHE_STATUS_PACKET(129),
        ON_SCREEN_TEXTURE_ANIMATION_PACKET(130),
        MAP_CREATE_LOCKED_COPY_PACKET(131),
        STRUCTURE_TEMPLATE_DATA_REQUEST_PACKET(132),
        STRUCTURE_TEMPLATE_DATA_RESPONSE_PACKET(133),
        CLIENT_CACHE_BLOB_STATUS_PACKET(135),
        CLIENT_CACHE_MISS_RESPONSE_PACKET(136),
        EDUCATION_SETTINGS_PACKET(137),
        EMOTE_PACKET(138),
        MULTIPLAYER_SETTINGS_PACKET(139),
        SETTINGS_COMMAND_PACKET(140),
        ANVIL_DAMAGE_PACKET(141),
        COMPLETED_USING_ITEM_PACKET(142),
        NETWORK_SETTINGS_PACKET(143),
        PLAYER_AUTH_INPUT_PACKET(144),
        CREATIVE_CONTENT_PACKET(145),
        PLAYER_ENCHANT_OPTIONS_PACKET(146),
        ITEM_STACK_REQUEST_PACKET(147),
        ITEM_STACK_RESPONSE_PACKET(148),
        PLAYER_ARMOR_DAMAGE_PACKET(149),
        CODE_BUILDER_PACKET(150),
        UPDATE_PLAYER_GAME_TYPE_PACKET(151),
        EMOTE_LIST_PACKET(152),
        POSITION_TRACKING_D_B_SERVER_BROADCAST_PACKET(153),
        POSITION_TRACKING_D_B_CLIENT_REQUEST_PACKET(154),
        DEBUG_INFO_PACKET(155),
        PACKET_VIOLATION_WARNING_PACKET(156),
        MOTION_PREDICTION_HINTS_PACKET(157),
        ANIMATE_ENTITY_PACKET(158),
        CAMERA_SHAKE_PACKET(159),
        PLAYER_FOG_PACKET(160),
        CORRECT_PLAYER_MOVE_PREDICTION_PACKET(161),
        ITEM_COMPONENT_PACKET(162),
        FILTER_TEXT_PACKET(163),
        CLIENTBOUND_DEBUG_RENDERER_PACKET(164),
        SYNC_ACTOR_PROPERTY_PACKET(165),
        ADD_VOLUME_ENTITY_PACKET(166),
        REMOVE_VOLUME_ENTITY_PACKET(167)
    }
}
