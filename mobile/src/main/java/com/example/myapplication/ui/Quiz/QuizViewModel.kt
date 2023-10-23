package com.example.myapplication.ui.Quiz

import androidx.lifecycle.ViewModel
import com.example.myapplication.domain.use_cases.Question.QuestionUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val questionUseCases: QuestionUseCases
) : ViewModel() {

}