package com.example.appuptodo.View.Intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.appuptodo.R

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun IntroStartPreview() {
    IntroStart(navController = rememberNavController())
}

@Composable
fun IntroStart(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {

            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Welcome to UpTodo",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "Please login to your account or create new account to continue",
                fontSize = 18.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .background(color = Color(0xff8875ff))
                .padding(10.dp)
                .clickable {
                    navController.navigate("IntroLogin")
                }
        ) {
            Text(text = "LOGIN", color = Color.White, textAlign = TextAlign.Center)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .border(width = 1.dp, color = Color.White)
                .padding(10.dp)
                .clickable {
                    navController.navigate("IntroRegister")
                }
        ) {
            Text(text = "CREAT ACOUNT", color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.padding(start = 2.dp, top = 7.dp))
        }
        Spacer(modifier = Modifier.height(90.dp))
    }
}