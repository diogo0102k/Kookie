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
package be.zvz.kookie.event

import be.zvz.kookie.plugin.Plugin
import be.zvz.kookie.timings.TimingsHandler

class RegisteredListener(
    val handler: (Event) -> Unit,
    val priority: EventPriority,
    val plugin: Plugin,
    val handleCancelled: Boolean,
    val timings: TimingsHandler,
    val listener: Listener? = null,
) {
    fun callEvent(event: Event) {
        if (event is Cancellable && event.isCancelled && !handleCancelled) {
            return
        }
        timings.startTiming()
        handler(event)
        timings.stopTiming()
    }
}
