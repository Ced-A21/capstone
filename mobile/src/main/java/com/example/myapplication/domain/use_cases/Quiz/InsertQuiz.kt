package com.example.myapplication.domain.use_cases.Quiz

import com.example.myapplication.domain.model.Quiz
import com.example.myapplication.domain.repository.QuizRepository

class InsertQuiz(
    private val repository: QuizRepository
) {

    suspend operator fun invoke(quiz: Quiz) {
        if(quiz.title.isEmpty()) {
            throw Exception("Title can't be empty.")
        }
        repository.insertQuiz(quiz)
    }
}