package com.test.forumAluraAPI.dto

import com.test.forumAluraAPI.entity.Course
import com.test.forumAluraAPI.entity.User
import org.jetbrains.annotations.NotNull
import javax.validation.constraints.NotEmpty

data class TopicDto(
    //field indica que essa anotação tá se referino ao campo e não aos getters e setter ou constructor
    @field:NotNull @field:NotEmpty val title: String,
    val message: String,
    val idCourse: Long,
    val idAuthor: Long,
)