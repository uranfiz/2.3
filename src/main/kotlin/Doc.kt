package ru.netology

data class DocAttachment(
    val doc: Doc
) : Attachment {
    override val type: String = "doc"
}

data class Doc(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String
)
