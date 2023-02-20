package com.example.forumk.services

import com.example.forumk.models.Course
import com.example.forumk.models.Topic
import com.example.forumk.models.User
import org.springframework.stereotype.Service

@Service
class TopicService(private var topics:List<Topic>) {
    init{
        val topic = Topic(
            id =1,
            title = "teste",
            message="teste",
            course = Course(
                id = 1,
                name="kotlin",
                category = "teste"
            ),
            author = User(
                id = 1,
                name="teste",
                email="teste"
            ),
        );
        topics = listOf(topic,topic,topic);
    }
    fun listar():List<Topic>{
        return this.topics
    }
}