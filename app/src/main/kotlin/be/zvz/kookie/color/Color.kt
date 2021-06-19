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
package be.zvz.kookie.color

import java.awt.Color as AwtColor

class Color @JvmOverloads constructor(r: Int, g: Int, b: Int, a: Int = 0xff) : AwtColor(r, g, b, a) {
    constructor(awtColor: AwtColor) : this(awtColor.red, awtColor.green, awtColor.blue, awtColor.alpha)

    fun toARGB(): Int {
        return (this.alpha shl 24) or (this.red shl 16) or (this.green shl 8) or this.blue
    }

    fun toRGBA(): Int {
        return (this.red shl 24) or (this.green shl 16) or (this.blue shl 8) or this.alpha
    }

    companion object {
        @JvmStatic
        fun mix(vararg colors: Color): Color {
            var (a, r, g, b) = listOf(0, 0, 0, 0)
            colors.forEach {
                a += it.alpha
                r += it.red
                g += it.green
                b += it.blue
            }

            val count = colors.size
            return Color(r / count, g / count, b / count, a / count)
        }

        @JvmStatic fun fromRGB(code: Int) = Color(code shr 16 and 0xff, code shr 8 and 0xff, code and 0xff)

        @JvmStatic fun fromARGB(code: Int) = Color(code shr 16 and 0xff, code shr 8 and 0xff, code and 0xff, code shr 24 and 0xff)

        @JvmStatic fun fromRGBA(c: Int) = Color(c shr 24 and 0xff, c shr 16 and 0xff, c shr 8 and 0xff, c and 0xff)
    }
}
