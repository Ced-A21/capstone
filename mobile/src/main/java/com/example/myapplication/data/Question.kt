package com.example.myapplication.data

data class Question(
    var id: Int,
    var quizId: Int, // TODO: new data class
    var choices: List<String>,
    var correctAnswer: Int
)