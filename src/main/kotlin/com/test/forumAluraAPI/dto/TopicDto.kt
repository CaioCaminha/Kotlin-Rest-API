package com.test.forumAluraAPI.dto

import com.test.forumAluraAPI.entity.Course
import com.test.forumAluraAPI.entity.User

data class TopicDto(
    val title: String,
    val message: String,
    val idCourse: Long,
    val idAuthor: Long,
)