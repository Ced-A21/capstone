package com.example.myapplication.ui.Quiz

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.myapplication.domain.model.Question

//@Composable
//fun Quiz(
//    quizViewModel: QuizViewModel = hiltViewModel()
//) {
//    val quizUiState by quizViewModel.quizUiState.collectAsState()
//    var question by remember { mutableStateOf(listOf("")) }
//    var option by remember { mutableStateOf(listOf("")) }
//    var correctAnswer by remember { mutableStateOf(listOf("")) }
//    var questionComponents by remember { mutableStateOf(listOf("")) }
//    val scope = rememberCoroutineScope()
//    Surface {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp, 16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            OutlinedTextField(
//                modifier = Modifier.fillMaxWidth(),
//                value = quizViewModel.quizTitle,
//                onValueChange = {quizViewModel.quizTitle=it},
//                label = { Text("Quiz Name") }
//            )
//            LazyColumn(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(16.dp, 16.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                items(quizUiState.questions) { question ->
//                    QuestionComponent(
//                        question = question,
//                        modifier = Modifier.onFocusChanged {
//                            if(it.isFocused) {
//                                quizViewModel.onFocusChange(question.id)
//                            }
//                        }
//                    )
//                }
//            }
//            Button(onClick = { quizViewModel.currentQuizId?.let { Question(quizId = it) }
//                ?.let { quizUiState.addQuestion(it) }}) {
//
//            }
//        }
//    }
//}
//
//@Composable
//fun QuestionComponent(
//    question: Question,
//    modifier: Modifier
//) {
//    OutlinedTextField(
//        modifier = Modifier.fillMaxWidth(),
//        value = question.actualQuestion.orEmpty(),
//        onValueChange = {question.actualQuestion=it},
//        label = { Text("Question") }
//    )
//    OutlinedTextField(
//        modifier = Modifier.fillMaxWidth(),
//        value = question.choice1.orEmpty(),
//        onValueChange = {question.choice1=it},
//        label = { Text("Option 1") }
//    )
//    OutlinedTextField(
//        modifier = Modifier.fillMaxWidth(),
//        value = question.choice2.orEmpty(),
//        onValueChange = {question.choice2=it},
//        label = { Text("Option 2") }
//    )
//    OutlinedTextField(
//        modifier = Modifier.fillMaxWidth(),
//        value = question.choice3.orEmpty(),
//        onValueChange = {question.choice3=it},
//        label = { Text("Option 3") }
//    )
//    OutlinedTextField(
//        modifier = Modifier.fillMaxWidth(),
//        value = question.choice4.orEmpty(),
//        onValueChange = {question.choice4=it},
//        label = { Text("Option 4") }
//    )
//}
//
//fun createQuestion(
//    question: Question
//) {
//    // TODO:
//}