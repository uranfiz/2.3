package ru.netology

data class LinkAttachment(
    val link: Link
) : Attachment {
    override val type: String = "link"
}

data class Link(
    val url: String,
    val title: String,
    val caption: String? = null
)
