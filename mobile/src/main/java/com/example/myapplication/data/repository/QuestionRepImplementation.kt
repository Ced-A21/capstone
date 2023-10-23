package com.example.myapplication.data.repository

import com.example.myapplication.data.source.QuestionDao
import com.example.myapplication.domain.model.Question
import com.example.myapplication.domain.repository.QuestionRepository
import kotlinx.coroutines.flow.Flow

// This class implements the interface class QuizRepository; it takes QuizDao as its constructor
// The override in the functions means that we are implementing the functions in the interface class QuizRepository
class QuestionRepImplementation(
    private val dao: QuestionDao
) : QuestionRepository {
    override fun getQuestions(): Flow<List<Question>> {
        return dao.getQuestions()
    }

    override suspend fun getQuestionById(id: Int): Question? {
        return dao.getQuestionById(id)
    }

    override suspend fun insertQuestion(question: Question) {
        return dao.insertQuestion(question)
    }

    override suspend fun deleteQuestion(question: Question) {
        return dao.deleteQuestion(question)
    }

    override fun getQuestionsByQuizId(quizId: Int): Flow<List<Question>> {
        return dao.getQuestionsByQuizId(quizId)
    }
}