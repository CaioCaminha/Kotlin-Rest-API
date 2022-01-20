package com.test.forumAluraAPI.service

import com.test.forumAluraAPI.entity.Course
import org.springframework.stereotype.Service
import java.util.*

@Service
class CourseService(private var courses: List<Course> ) {
    init {
        val course = Course(
            id = 1,
            name = "Spring",
            category = "api rest"
        )
        courses = Arrays.asList(course)
    }

    fun getById(id: Long): Course{
        return courses.stream().filter{
            t -> t.id == id
        }.findFirst().get()
    }
}