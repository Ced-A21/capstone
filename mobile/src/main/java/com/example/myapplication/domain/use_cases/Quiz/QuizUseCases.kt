package com.example.myapplication.domain.use_cases.Quiz

data class QuizUseCases (
    val deleteQuiz: DeleteQuiz,
    val getQuizById: GetQuizById,
    val getQuizList: GetQuizList,
    val insertQuiz: InsertQuiz
)