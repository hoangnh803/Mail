package com.example.model

data class Email(
    val sender: String,
    val subject: String,
    val time: String,
    var isStarred: Boolean,
    val content: String // Thêm thuộc tính cho nội dung email
)


