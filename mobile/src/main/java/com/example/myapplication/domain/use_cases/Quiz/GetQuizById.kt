package com.example.myapplication.domain.use_cases.Quiz

import com.example.myapplication.domain.model.Quiz
import com.example.myapplication.domain.repository.QuizRepository

class GetQuizById(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(id: Int): Quiz? {
        return repository.getQuizById(id)
    }
}