package com.test.forumAluraAPI.controller

import com.test.forumAluraAPI.dto.TopicDto
import com.test.forumAluraAPI.entity.Topic
import com.test.forumAluraAPI.service.TopicService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import java.net.URI

@RestController
@RequestMapping("/topicos")
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
    fun createTopic(
        @RequestBody topic: TopicDto,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<Topic>{

        var topic = this.topicService.insert(topic)

//O metodo created do Response Entity retorna tbm o header location indicando onde o client pode acessar esse recurso criado
//O uriBuilder permite retornar no location também o endereço do server
        return ResponseEntity
            .created(uriBuilder.path("/topic/${topic.id}").build().toUri())
            .body(topic);
    }
}