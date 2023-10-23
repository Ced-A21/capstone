package com.example.myapplication.domain.use_cases.Quiz

import com.example.myapplication.domain.model.Quiz
import com.example.myapplication.domain.repository.QuizRepository

class DeleteQuiz(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(quiz: Quiz) {
        repository.deleteQuiz(quiz)
    }
}