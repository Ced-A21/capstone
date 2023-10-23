package com.example.myapplication.domain.use_cases.Question

import com.example.myapplication.domain.model.Question
import com.example.myapplication.domain.repository.QuestionRepository
import kotlinx.coroutines.flow.Flow

class GetQuestionList(
    private val repository: QuestionRepository
) {
    operator fun invoke(): Flow<List<Question>> {
        return repository.getQuestions()
    }
}