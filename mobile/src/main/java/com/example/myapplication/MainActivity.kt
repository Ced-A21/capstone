package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.material.rememberScaffoldState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.LandingScreen
//import com.example.myapplication.ui.Quiz.Quiz
//import com.example.myapplication.ui.QuizList.QuizList
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // to be changed
        setContent {
            PhoneApp()
        }
    }
}

@Preview
@Composable
fun PhoneApp() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text("Companion App") },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            scope.launch { scaffoldState.drawerState.open() }
                        }
                    ) {
                        Icon(Icons.Filled.Menu, contentDescription = "null")
                    }
                }
            )
        },
        drawerContent = {Text("Drawer content")}
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "quiz",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = "landingscreen") {
                LandingScreen()
            }
            composable(route = "quizlist") {
                //QuizList()
            }
            composable(route = "quiz") {
                //Quiz()
            }
        }
    }
}