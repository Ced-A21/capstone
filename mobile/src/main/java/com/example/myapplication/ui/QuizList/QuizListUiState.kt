package com.example.myapplication.ui.QuizList

import com.example.myapplication.domain.model.Quiz

data class QuizListUiState(
    val quizzes: List<Quiz> = emptyList()
    // val quizzes: List<Quiz> = listOf(Quiz(1, "Hey", 1), Quiz(2, "Hey", 2))
)
