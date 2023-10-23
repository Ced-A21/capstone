package com.example.myapplication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.Question

@Preview
@Composable
fun QuizBuilder() {
    var quizName by remember { mutableStateOf("") }
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp, 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = quizName,
                onValueChange = {quizName=it},
                label = { Text("Quiz Name") })
        }
    }
}

@Composable
fun QuestionComponent(question: String, option: String) {

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = question,
        onValueChange = {question=it},
        label = { Text("Question 1") })
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = option,
        onValueChange = {option=it},
        label = { Text("Option 1") })
}