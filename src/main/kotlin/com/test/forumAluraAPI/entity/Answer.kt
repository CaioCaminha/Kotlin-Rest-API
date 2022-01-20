package com.test.forumAluraAPI.entity

import java.time.LocalDateTime

data class Answer(
    val id: Long? = null,
    val message: String,
    val createdAt: LocalDateTime,
    val author: User,
    val topic: Topic,
    val isSolution: Boolean
)