package com.example.myapplication.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Quiz(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val timestamp: Long
)