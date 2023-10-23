package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.Quiz
import kotlinx.coroutines.flow.Flow

// Interface declares a contract in which if this class is implemented, these functions must be defined there; see QuizRepImplementation
interface QuizRepository {
    fun getQuizzes(): Flow<List<Quiz>>

    suspend fun getQuizById(id: Int): Quiz?

    suspend fun insertQuiz(quiz: Quiz)

    suspend fun deleteQuiz(quiz: Quiz)
}