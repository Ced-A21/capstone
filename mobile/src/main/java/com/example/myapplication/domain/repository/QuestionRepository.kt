package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.Question
import kotlinx.coroutines.flow.Flow

// Interface declares a contract in which if this class is implemented, these functions must be defined there; see QuizRepImplementation
interface QuestionRepository {
    fun getQuestions(): Flow<List<Question>>

    suspend fun getQuestionById(id: Int): Question?

    suspend fun insertQuestion(question: Question)

    suspend fun deleteQuestion(question: Question)

    fun getQuestionsByQuizId(quizId: Int): Flow<List<Question>>
}