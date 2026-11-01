package ru.netology

data class VideoAttachment(
    val video: Video
) : Attachment {
    override val type: String = "video"
}

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val duration: Int
)
