package be.zvz.kookie.network.mcpe.protocol.types.skin

class PersonaPieceTintColor(private val pieceType: String, private val colors: MutableList<String>) {

    fun getPieceType(): String = pieceType

    fun getColors(): MutableList<String> = colors

    companion object {
        const val PIECE_TYPE_PERSONA_EYES = "persona_eyes"
        const val PIECE_TYPE_PERSONA_HAIR = "persona_hair"
        const val PIECE_TYPE_PERSONA_MOUTH = "persona_mouth"
    }
}
