package com.test.forumAluraAPI.service

import com.test.forumAluraAPI.entity.Course
import com.test.forumAluraAPI.entity.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private var authors: List<User>) {

    init {
        val course = Course(
            id = 1,
            name = "Spring",
            category = "Api rest"
        )
        authors = Arrays.asList()
    }

    fun getById(id: Long): User{
        return authors.stream().filter{
            t -> t.id == id
        }.findFirst().get()
    }

}