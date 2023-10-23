package com.example.myapplication.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(
    entity = Quiz::class,
    parentColumns = ["id"],
    childColumns = ["quizId"],
    onDelete = CASCADE)])
data class Question(
    @PrimaryKey val id: Int? = null,
    val quizId: Int? = null,
    var actualQuestion: String? = null,
    // var choices: MutableList<String> = MutableList(4){""}, // needs a type converter
    var choice1: String? = null, // temporary
    var choice2: String? = null,
    var choice3: String? = null,
    var choice4: String? = null,
    var correctAnswer: Int? = null
)