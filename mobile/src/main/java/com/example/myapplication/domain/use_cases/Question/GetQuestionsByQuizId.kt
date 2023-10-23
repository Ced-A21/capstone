package com.example.myapplication.domain.use_cases.Question

import com.example.myapplication.domain.model.Question
import com.example.myapplication.domain.repository.QuestionRepository
import kotlinx.coroutines.flow.Flow

class GetQuestionsByQuizId(
    private val repository: QuestionRepository
) {
    suspend operator fun invoke(quizId: Int): Flow<List<Question>> {
        return repository.getQuestionsByQuizId(quizId)
    }
}