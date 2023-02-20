package com.example.forumk.controllers

import com.example.forumk.models.Topic
import com.example.forumk.services.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController(private val service:TopicService) {
    @GetMapping
    fun list():List<Topic>{
        return service.listar();
    }
}