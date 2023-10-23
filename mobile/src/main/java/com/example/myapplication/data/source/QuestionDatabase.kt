package com.example.myapplication.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.domain.model.Question
import com.example.myapplication.domain.model.Quiz

@Database(
    entities = [Question::class, Quiz::class],
    version = 1
)
abstract class QuestionDatabase: RoomDatabase() {
    abstract val questionDao: QuestionDao
}