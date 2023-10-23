package com.example.myapplication.data.source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.domain.model.Question
import kotlinx.coroutines.flow.Flow

@Dao // Marks the class a Data Access Object (DAO); should either be interface or abstract class
interface QuestionDao {
    @Query("SELECT * FROM question") // Marks a method as a query method; the value inside the parenthesis are ran when this method is called
    fun getQuestions(): Flow<List<Question>>

    @Query("SELECT * FROM question WHERE id = :id")
    suspend fun getQuestionById(id: Int): Question?

    @Insert(onConflict = OnConflictStrategy.REPLACE) // Marks a method as an insert method; will insert its parameters into the database
    suspend fun insertQuestion(question: Question)

    @Delete // Marks a method as a delete method; will delete its parameters from the database
    suspend fun deleteQuestion(question: Question)

    @Query("SELECT * FROM question WHERE quizId = :quizId")
    fun getQuestionsByQuizId(quizId: Int): Flow<List<Question>>
}