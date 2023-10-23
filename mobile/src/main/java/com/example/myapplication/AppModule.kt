package com.example.myapplication

import android.app.Application
import androidx.room.Room
import com.example.myapplication.data.repository.QuestionRepImplementation
import com.example.myapplication.data.repository.QuizRepImplementation
import com.example.myapplication.data.source.QuestionDatabase
import com.example.myapplication.data.source.QuizDatabase
import com.example.myapplication.domain.repository.QuestionRepository
import com.example.myapplication.domain.repository.QuizRepository
import com.example.myapplication.domain.use_cases.Question.DeleteQuestion
import com.example.myapplication.domain.use_cases.Quiz.DeleteQuiz
import com.example.myapplication.domain.use_cases.Question.GetQuestionById
import com.example.myapplication.domain.use_cases.Question.GetQuestionList
import com.example.myapplication.domain.use_cases.Question.GetQuestionsByQuizId
import com.example.myapplication.domain.use_cases.Quiz.GetQuizById
import com.example.myapplication.domain.use_cases.Quiz.GetQuizList
import com.example.myapplication.domain.use_cases.Question.InsertQuestion
import com.example.myapplication.domain.use_cases.Question.QuestionUseCases
import com.example.myapplication.domain.use_cases.Quiz.InsertQuiz
import com.example.myapplication.domain.use_cases.Quiz.QuizUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideQuizDatabase(app: Application): QuizDatabase {
        return Room.databaseBuilder(
            app,
            QuizDatabase::class.java,
            "QuizDB"
        ).build()
    }

    @Provides
    @Singleton
    fun provideQuestionDatabase(app: Application): QuestionDatabase {
        return Room.databaseBuilder(
            app,
            QuestionDatabase::class.java,
            "QuestionDB"
        ).build()
    }

    @Provides
    @Singleton
    fun provideQuizRepository(db: QuizDatabase): QuizRepository {
        return QuizRepImplementation(db.quizDao)
    }

    @Provides
    @Singleton
    fun provideQuestionRepository(db: QuestionDatabase): QuestionRepository {
        return QuestionRepImplementation(db.questionDao)
    }

    @Provides
    @Singleton
    fun provideDeleteQuiz(repository: QuizRepository): DeleteQuiz {
        return DeleteQuiz(repository)
    }

    @Provides
    @Singleton
    fun provideGetQuizzes(repository: QuizRepository): GetQuizList {
        return GetQuizList(repository)
    }

    @Provides
    @Singleton
    fun provideGetQuestionsByQuizId(repository: QuestionRepository): GetQuestionsByQuizId {
        return GetQuestionsByQuizId(repository)
    }

    @Provides
    @Singleton
    fun provideDeleteQuestion(repository: QuestionRepository): DeleteQuestion {
        return DeleteQuestion(repository)
    }

    @Provides
    @Singleton
    fun provideGetQuizById(repository: QuizRepository): GetQuizById {
        return GetQuizById(repository)
    }

    @Provides
    @Singleton
    fun provideInsertQuiz(repository: QuizRepository): InsertQuiz {
        return InsertQuiz(repository)
    }

    @Provides
    @Singleton
    fun provideInsertQuestion(repository: QuestionRepository): InsertQuestion {
        return InsertQuestion(repository)
    }

    @Provides
    @Singleton
    fun provideGetQuestionById(repository: QuestionRepository): GetQuestionById {
        return GetQuestionById(repository)
    }

    @Provides
    @Singleton
    fun provideQuestionUseCases(repository: QuestionRepository): QuestionUseCases {
        return QuestionUseCases(
            deleteQuestion = DeleteQuestion(repository),
            getQuestionById = GetQuestionById(repository),
            getQuestionList = GetQuestionList(repository),
            getQuestionsByQuizId = GetQuestionsByQuizId(repository),
            insertQuestion = InsertQuestion(repository)

        )
    }

    @Provides
    @Singleton
    fun provideQuizUseCases(repository: QuizRepository): QuizUseCases {
        return QuizUseCases(
            deleteQuiz = DeleteQuiz(repository),
            getQuizById = GetQuizById(repository),
            getQuizList = GetQuizList(repository),
            insertQuiz = InsertQuiz(repository)

        )
    }
}