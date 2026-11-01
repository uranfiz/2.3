package ru.netology

data class AudioAttachment(
    val audio: Audio
) : Attachment {
    override val type: String = "audio"
}

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String
)
