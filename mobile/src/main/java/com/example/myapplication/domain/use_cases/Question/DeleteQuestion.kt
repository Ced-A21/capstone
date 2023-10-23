package com.example.myapplication.domain.use_cases.Question

import com.example.myapplication.domain.model.Question
import com.example.myapplication.domain.repository.QuestionRepository

class DeleteQuestion(
    private val repository: QuestionRepository
) {
    suspend operator fun invoke(question: Question) {
        repository.deleteQuestion(question)
    }
}