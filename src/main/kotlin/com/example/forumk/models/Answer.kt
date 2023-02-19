package com.example.forumk.models

import java.time.LocalDateTime

data class Answer (
    val id: Long?,
    val message:String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val topic: Topic,
    var solution:Boolean
)

