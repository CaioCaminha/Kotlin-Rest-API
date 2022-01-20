package com.test.forumAluraAPI.service

import com.test.forumAluraAPI.dto.TopicDto
import com.test.forumAluraAPI.entity.Course
import com.test.forumAluraAPI.entity.Topic
import com.test.forumAluraAPI.entity.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicService(
    private var topics: List<Topic> = ArrayList(),
    val courseService: CourseService
) {



    fun getTopics(): List<Topic>{
        return topics
    }

    fun getTopicById(id: Long): Topic{
        //chama o metodo filter da api de stream do java 8
        //implementa a condição e pega o primeiro encontrado
        return topics.stream().filter{
            t -> t.id == id
        }.findFirst().get()
    }

    fun insert(topicDto: TopicDto): Topic{
        val topic = Topic(
            id = topics.size + 1L,
            title = topicDto.title,
            course = courseService.getById(topicDto.idCourse),
            author = //todo: implementar UserService
        )


        topics.plus(topic)
        return topic;
    }
}