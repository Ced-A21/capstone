package com.example.myapplication.ui.QuizList

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.QuizList.components.QuizItem

@Preview
@Composable
fun QuizList(
    //navController: NavController,
    quizListViewModel: QuizListViewModel = hiltViewModel()
) {
    val quizListUiState = quizListViewModel.state.value
    val scope = rememberCoroutineScope()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        items(quizListUiState.quizzes) { quiz ->
            QuizItem()
        }

    }
}