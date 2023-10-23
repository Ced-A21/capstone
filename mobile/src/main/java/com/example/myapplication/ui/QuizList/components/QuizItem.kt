package com.example.myapplication.ui.QuizList.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Preview
@Composable
fun QuizItem(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier
        .height(120.dp)
        .fillMaxWidth()) {
        Canvas(modifier = Modifier.matchParentSize()) {
            drawRoundRect(
                color = Color.LightGray,
                size = size,
                cornerRadius = CornerRadius(50f, 50f)
            )
        }
        Row(modifier = Modifier) {
            Box(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.35f)) {
                Canvas(modifier = Modifier  // Canvas to be made clickable
                    .fillMaxSize()) {
                    val path = Path().apply {
                        addRoundRect(
                            RoundRect(
                                rect = Rect(
                                    offset = Offset.Zero,
                                    size = size
                                ),
                                topLeft = CornerRadius(50f, 50f),
                                bottomLeft = CornerRadius(50f, 50f)
                            )
                        )
                    }
                    drawPath(path, color = Color.Black)
                }
                Column(modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(modifier = Modifier
                        .fillMaxSize(0.5f),
                        alignment = Alignment.Center,
                        painter = painterResource(id = R.drawable.classicon),
                        contentDescription = null)
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "START",
                        color = Color.White)
                }
            }
            Column(modifier = Modifier.padding(15.dp)) {
                Text(text = "Title",
                    fontWeight = FontWeight.Bold)
                Text(text = "Subject")
                Text(text = "Difficulty")
                Text(text = "Items")
            }
        }

    }
}