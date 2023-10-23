package com.example.myapplication.ui.Quiz

import androidx.compose.runtime.toMutableStateList
import com.example.myapplication.domain.model.Question

data class QuizUiState(
    val initQuestions: List<Question> = emptyList(),
    val questionCount: Int = 0,
    val questionIndex: Int = 0,
    val optionIndexWithinQuestion: Int = 0
) {
    val _questions: MutableList<Question> = initQuestions.toMutableStateList()
    val questions: List<Question> = _questions + initQuestions
    fun addQuestion(qstn: Question) {
        _questions.add(0, qstn)
    }
}