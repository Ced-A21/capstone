package com.example.myapplication.data.source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.domain.model.Quiz
import kotlinx.coroutines.flow.Flow

@Dao // Marks the class a Data Access Object (DAO); should either be interface or abstract class
interface QuizDao {
    @Query("SELECT * FROM quiz") // Marks a method as a query method; the value inside the parenthesis are ran when this method is called
    fun getQuizzes(): Flow<List<Quiz>>

    @Query("SELECT * FROM quiz WHERE id = :id")
    suspend fun getQuizById(id: Int): Quiz?

    @Insert(onConflict = OnConflictStrategy.REPLACE) // Marks a method as an insert method; will insert its parameters into the database
    suspend fun insertQuiz(quiz: Quiz)

    @Delete // Marks a method as a delete method; will delete its parameters from the database
    suspend fun deleteQuiz(quiz: Quiz)
}