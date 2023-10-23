package com.example.myapplication.data.repository

import com.example.myapplication.domain.model.Quiz
import com.example.myapplication.data.source.QuizDao
import com.example.myapplication.domain.repository.QuizRepository
import kotlinx.coroutines.flow.Flow

// This class implements the interface class QuizRepository; it takes QuizDao as its constructor
// The override in the functions means that we are implementing the functions in the interface class QuizRepository
class QuizRepImplementation(
    private val dao: QuizDao
) : QuizRepository {
    override fun getQuizzes(): Flow<List<Quiz>> {
        return dao.getQuizzes()
    }

    override suspend fun getQuizById(id: Int): Quiz? {
        return dao.getQuizById(id)
    }

    override suspend fun insertQuiz(quiz: Quiz) {
        return dao.insertQuiz(quiz)
    }

    override suspend fun deleteQuiz(quiz: Quiz) {
        return dao.deleteQuiz(quiz)
    }
}