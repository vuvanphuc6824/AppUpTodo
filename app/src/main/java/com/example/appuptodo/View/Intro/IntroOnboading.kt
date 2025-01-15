package com.example.appuptodo.View.Intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
fun IntroOnboardingPreview() {
    IntroOnboading(navController = rememberNavController())
}
@Composable
fun IntroOnboading(navController: NavHostController) {
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
            Image(
                painter = painterResource(id = R.drawable.onboading1),
                contentDescription = "Illustration",
                modifier = Modifier.size(200.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Manage your tasks",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "You can easily manage all of your daily tasks in DoMe for free",
                fontSize = 18.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "BACK",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
                    .clickable {
                        navController.popBackStack()
                    }
            )
            Row(
                modifier = Modifier
                    .background(color = Color(0xff8875ff))
                    .padding(10.dp)
                    .clickable {
                        navController.navigate("IntroOnboading2")
                    }
            ) {
                Text(text = "NEXT", color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(90.dp))
    }
}


