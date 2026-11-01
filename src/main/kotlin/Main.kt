package ru.netology

fun main() {
    val service = WallService()

    val photo = PhotoAttachment(
        Photo(id = 1, ownerId = 1, photo130 = "https://vk.com/some_photo_link")
    )
    val video = VideoAttachment(
        Video(id = 1, ownerId = 1, title = "A Funny Video", duration = 30)
    )

    val post = service.add(
        Post(
            id = 0,
            ownerId = 1,
            text = "Привет, мир!",
            attachments = listOf(photo, video)
        )
    )
    println(post)
}
