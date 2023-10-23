package com.example.myapplication.domain.use_cases.Question

import com.example.myapplication.domain.model.Question
import com.example.myapplication.domain.model.Quiz
import com.example.myapplication.domain.repository.QuestionRepository
import com.example.myapplication.domain.repository.QuizRepository

class GetQuestionById(
    private val repository: QuestionRepository
) {
    suspend operator fun invoke(id: Int): Question? {
        return repository.getQuestionById(id)
    }
}