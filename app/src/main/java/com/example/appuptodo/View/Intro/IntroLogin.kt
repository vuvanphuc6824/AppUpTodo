package com.example.appuptodo.View.Intro

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.appuptodo.R
import kotlinx.coroutines.delay

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun IntroLoginPreview() {
    IntroLogin(navController = rememberNavController())
}

@Composable
fun IntroLogin(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(horizontal = 16.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.back), "",
            modifier = Modifier
                .padding(top = 40.dp, start = 20.dp)
                .clickable {
                    navController.popBackStack()
                }
        )
        Text(
            "Login",
            modifier = Modifier
                .padding(top = 40.dp, start = 20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.White
        )

        Column(
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(
                text = "Username",
                modifier = Modifier
                    .padding(top = 20.dp, start = 20.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            TextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color(0xffE0E0E0),
                    focusedIndicatorColor = Color(0xffE0E0E0),
                    cursorColor = Color(0xff8875ff)
                ),
                textStyle = TextStyle(
                    fontFamily = FontFamily.Serif,
                    color = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                )
            )

            // Password
            Text(
                text = "Password",
                modifier = Modifier
                    .padding(top = 40.dp, start = 20.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color(0xffE0E0E0),
                    focusedIndicatorColor = Color(0xffE0E0E0),
                    cursorColor = Color(0xff8875ff)
                ),
                textStyle = TextStyle(
                    fontFamily = FontFamily.Serif,
                    color = Color.White
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                visualTransformation = PasswordVisualTransformation()
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .background(color = Color(0xff8875ff))
                .padding(10.dp)
                .clickable {
                    navController.navigate("UserHome")
                }
        ) {
            Text(text = "LOGIN", color = Color.White, textAlign = TextAlign.Center)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            // Left divider
            Column(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
                    .height(1.dp)
                    .weight(1f)
                    .background(color = Color.White)
            ) {}

            Text(
                text = "Or",
                color = Color.White,
                fontSize = 15.sp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(5.dp),
            )

            Column(
                modifier = Modifier
                    .padding(end = 10.dp, top = 10.dp)
                    .height(1.dp)
                    .weight(1f)
                    .background(color = Color.White)
            ) {}
        }

        Spacer(modifier = Modifier.height(50.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .border(width = 1.dp, color = Color.White)
                .padding(10.dp)
                .clickable {
                    Toast.makeText(context, "🤖 Đang phát triển tính năng này ", Toast.LENGTH_SHORT).show()
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Logo",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "Login with Google", color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.padding(start = 2.dp, top = 7.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .border(width = 1.dp, color = Color.White)
                .padding(10.dp)
                .clickable {
                    Toast.makeText(context, "🤖 Đang phát triển tính năng này ", Toast.LENGTH_SHORT).show()
                }
        ) {
            Image(
                painter = painterResource(id = R.drawable.apple),
                contentDescription = "Logo",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "Login with Appe", color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.padding(start = 2.dp, top = 7.dp))
        }
    }
}

