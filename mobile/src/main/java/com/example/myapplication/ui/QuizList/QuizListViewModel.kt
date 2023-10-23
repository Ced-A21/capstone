package com.example.myapplication.ui.QuizList

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.model.Quiz
import com.example.myapplication.domain.use_cases.Quiz.QuizUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizListViewModel @Inject constructor(
    private val quizUseCases: QuizUseCases
) : ViewModel() {

    private val _state = mutableStateOf(QuizListUiState())
    val state: State<QuizListUiState> = _state

    private  var getQuizzesJob: Job? = null

    init {
        getQuizzes()
    }
    fun onDeleteNote(quiz: Quiz) {
        viewModelScope.launch {
            quizUseCases.deleteQuiz(quiz)
        }
    }

    private fun getQuizzes() {
        getQuizzesJob?.cancel()
        getQuizzesJob = quizUseCases.getQuizList()
            .onEach { quizzes ->
                _state.value = state.value.copy(
                    quizzes = quizzes,
                )
            }
            .launchIn(viewModelScope)
    }
}