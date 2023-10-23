package com.example.myapplication.domain.use_cases.Quiz

import com.example.myapplication.domain.model.Quiz
import com.example.myapplication.domain.repository.QuizRepository
import kotlinx.coroutines.flow.Flow

class GetQuizList(
    private val repository: QuizRepository
) {
    operator fun invoke(): Flow<List<Quiz>> {
        return repository.getQuizzes()
    }
}