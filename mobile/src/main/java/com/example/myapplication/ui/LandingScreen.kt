package com.example.myapplication.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.ui.res.painterResource

import com.example.myapplication.R





@Preview
@Composable
fun LandingScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(2f)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {

            Spacer(modifier = Modifier.height(80.dp))

            Button(onClick = {  },colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(red = 223, blue = 225, green = 228),
                contentColor = Color.Black),
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)
                ) {

                Image(painter = painterResource(id = R.drawable.telephone),
                    contentDescription = "null",
                    modifier = Modifier.size(40.dp).padding(end = 10.dp),
                    colorFilter = ColorFilter.tint(Color(red = 170, blue = 255, green = 0)))


                Text("Call",
                    fontWeight = FontWeight.Bold
                )


            }
            Spacer(modifier = Modifier.height(40.dp))

            Button(onClick = {  },colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(red = 223, blue = 225, green = 228),
                contentColor = Color.Black),
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.iconquiz),
                    contentDescription = "null",
                    modifier = Modifier.size(40.dp).padding(end = 10.dp),
                    colorFilter = ColorFilter.tint(Color(red = 170, blue = 255, green = 0)))
                Text("iQuiz",
                    fontWeight = FontWeight.Bold
                )

            }

            Spacer(modifier = Modifier.height(40.dp))

            Button(onClick = {  },colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(red = 223, blue = 225, green = 228),
                contentColor = Color.Black),
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)
                ) {
                Image(painter = painterResource(id = R.drawable.message),
                    contentDescription = "null",
                    modifier = Modifier.size(40.dp).padding(end = 10.dp),
                    colorFilter = ColorFilter.tint(Color(red = 170, blue = 255, green = 0)))
                Text("Message",
                    fontWeight = FontWeight.Bold
                )


            }

            Spacer(modifier = Modifier.height(40.dp))

            Button(onClick = {  },colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(red = 223, blue = 225, green = 228),
                contentColor = Color.Black),
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)) {
                Image(painter = painterResource(id = R.drawable.location),
                    contentDescription = "null",
                    modifier = Modifier.size(40.dp).padding(end = 10.dp),
                    colorFilter = ColorFilter.tint(Color(red = 170, blue = 255, green = 0)))

                Text("Location",
                    fontWeight = FontWeight.Bold
                )

            }

            Spacer(modifier = Modifier.height(40.dp))

            Button(onClick = {  },colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(red = 223, blue = 225, green = 228),
                contentColor = Color.Black),
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)) {
                Image(painter = painterResource(id = R.drawable.student),
                    contentDescription = "null",
                    modifier = Modifier.size(40.dp).padding(end = 10.dp),
                    colorFilter = ColorFilter.tint(Color(red = 170, blue = 255, green = 0)))

                Text("Students",
                    fontWeight = FontWeight.Bold
                )

            }
        }
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
        ) {
            items(5) { index ->
                Text(text = "Notification: $index")
            }
        }
    }
}

