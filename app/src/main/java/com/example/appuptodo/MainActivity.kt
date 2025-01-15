package com.example.appuptodo

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appuptodo.View.Intro.IntroLogin
import com.example.appuptodo.View.Intro.IntroOnboading
import com.example.appuptodo.View.Intro.IntroOnboading2
import com.example.appuptodo.View.Intro.IntroOnboading3
import com.example.appuptodo.View.Intro.IntroRegister
import com.example.appuptodo.View.Intro.IntroStart
import com.example.appuptodo.View.Intro.IntroWelcome
import com.example.appuptodo.View.User.UserAdd
import com.example.appuptodo.View.User.UserCalendar
import com.example.appuptodo.View.User.UserFocuse
import com.example.appuptodo.View.User.UserHome
import com.example.appuptodo.View.User.UserProfile
import com.example.appuptodo.View.navigation.NavigationButtons

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainNavigation()
        }
    }
    @RequiresApi(Build.VERSION_CODES.O)
    @Preview(showBackground = true)
    @Composable
    fun MainNavigation() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = ROUTER.IntroWelcome.name) {
            composable(ROUTER.IntroWelcome.name) {
                IntroWelcome(navController = navController)
            }
            composable(ROUTER.IntroOnboading.name) {
                IntroOnboading(navController = navController)
            }
            composable(ROUTER.IntroOnboading2.name) {
                IntroOnboading2(navController = navController)
            }
            composable(ROUTER.IntroOnboading3.name) {
                IntroOnboading3(navController = navController)
            }
            composable(ROUTER.IntroStart.name) {
                IntroStart(navController = navController)
            }
            composable(ROUTER.IntroLogin.name) {
                IntroLogin(navController = navController)
            }
            composable(ROUTER.IntroRegister.name) {
                IntroRegister(navController = navController)
            }
            composable(ROUTER.UserHome.name) {
                NavigationButtons(navController)
            }
            composable(ROUTER.UserCalendar.name) {
                UserCalendar(navController = navController)
            }
            composable(ROUTER.UserFocuse.name) {
                UserFocuse(navController = navController)
            }
            composable(ROUTER.UserProfile.name) {
                UserProfile(navController = navController)
            }
            composable(ROUTER.UserAdd.name) {
                UserAdd(navController = navController)
            }
        }
    }
    enum class ROUTER {
        IntroWelcome,
        IntroOnboading,
        IntroOnboading2,
        IntroOnboading3,
        IntroLogin,
        IntroRegister,
        UserHome,
        IntroStart,
        UserCalendar,
        UserFocuse,
        UserProfile,
        UserAdd,
    }
}