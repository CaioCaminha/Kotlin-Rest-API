package com.test.forumAluraAPI.controller

import com.test.forumAluraAPI.entity.Topic
import com.test.forumAluraAPI.service.TopicService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/hello")
class TopicController(
    private val topicService: TopicService
) {



    @GetMapping
    fun getAll(): List<Topic>{
        return this.topicService.getTopics()
    }


    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Topic{
        return this.topicService.getTopicById(id)
    }

    @PostMapping
    fun createTopic(@RequestBody topic: Topic): ResponseEntity<Topic>{
        return ResponseEntity
            .created(URI(""))
            .body(this.topicService.insert(topic));
    }
}