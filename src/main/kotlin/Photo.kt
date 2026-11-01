package ru.netology

data class PhotoAttachment(
    val photo: Photo
) : Attachment {
    override val type: String = "photo"
}

data class Photo(
    val id: Int,
    val ownerId: Int,
    val photo130: String? = null,
    val photo604: String? = null
)
