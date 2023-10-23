package com.example.myapplication.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.domain.model.Quiz

@Database(
    entities = [Quiz::class],
    version = 1
)
abstract class QuizDatabase: RoomDatabase() {
    abstract val quizDao: QuizDao
}