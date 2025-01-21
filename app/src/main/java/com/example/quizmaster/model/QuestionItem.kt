package com.example.quizmaster.model

data class QuestionItem(
    val answer: String,
    val category: String,
    val choices: List<String>,
    val question: String
)