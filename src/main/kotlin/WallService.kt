package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var nextId = 1
    private var nextCommentId = 1

    fun add(post: Post): Post {
        val newPost = post.copy(id = nextId++)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        for ((index, p) in posts.withIndex()) {
            if (p.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun getById(id: Int): Post? = posts.firstOrNull { it.id == id }

    private var comments = emptyArray<Comment>()

    fun createComment(postId: Int, comment: Comment): Comment? {
        val post = getById(postId) ?: return null
        val newComment = comment.copy(id = nextCommentId++)
        comments += newComment
        return newComment
    }
}
