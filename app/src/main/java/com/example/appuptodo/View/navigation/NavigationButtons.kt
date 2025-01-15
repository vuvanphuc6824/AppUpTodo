package com.example.appuptodo.View.navigation
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appuptodo.MainActivity
import com.example.appuptodo.R
import com.example.appuptodo.View.User.UserAdd
import com.example.appuptodo.View.User.UserCalendar
import com.example.appuptodo.View.User.UserFocuse
import com.example.appuptodo.View.User.UserHome
import com.example.appuptodo.View.User.UserProfile

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationButtons(navHostController: NavHostController) {
    var isSelected by rememberSaveable { mutableStateOf(MainActivity.ROUTER.UserHome.name) }
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xff393b40),
            ) {
                // Home
                NavigationBarItem(
                    selected = isSelected == MainActivity.ROUTER.UserHome.name,
                    onClick = {
                        isSelected = MainActivity.ROUTER.UserHome.name
                        navController.navigate(MainActivity.ROUTER.UserHome.name) {
                            popUpTo(navController.graph.startDestinationId) { inclusive = true }
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    label = {
                        Text(text = "Home", color = if (isSelected == MainActivity.ROUTER.UserHome.name) Color(0xFF059BEE) else Color.Black)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF059BEE),
                        unselectedIconColor = Color.Black,
                        indicatorColor = Color.White
                    )
                )


                NavigationBarItem(
                    selected = isSelected == MainActivity.ROUTER.UserCalendar.name,
                    onClick = {
                        isSelected = MainActivity.ROUTER.UserCalendar.name
                        navController.navigate(MainActivity.ROUTER.UserCalendar.name) {
                            popUpTo(navController.graph.startDestinationId) { inclusive = true }
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.lich),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    label = {
                        Text(text = "Calendar", color = if (isSelected == MainActivity.ROUTER.UserCalendar.name) Color(0xFF059BEE) else Color.Black)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF059BEE),
                        unselectedIconColor = Color.Black,
                        indicatorColor = Color.White
                    )
                )


                NavigationBarItem(
                    selected = isSelected == MainActivity.ROUTER.UserAdd.name,
                    onClick = {
                        isSelected = MainActivity.ROUTER.UserAdd.name
                        navController.navigate(MainActivity.ROUTER.UserAdd.name) {
                            popUpTo(navController.graph.startDestinationId) { inclusive = true }
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.add),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    label = {
                        Text(text = "Add", color = if (isSelected == MainActivity.ROUTER.UserAdd.name) Color(0xFF059BEE) else Color.Black)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF059BEE),
                        unselectedIconColor = Color.Black,
                        indicatorColor = Color.White
                    )
                )


                NavigationBarItem(
                    selected = isSelected == MainActivity.ROUTER.UserFocuse.name,
                    onClick = {
                        isSelected = MainActivity.ROUTER.UserFocuse.name
                        navController.navigate(MainActivity.ROUTER.UserFocuse.name) {
                            popUpTo(navController.graph.startDestinationId) { inclusive = true }
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.oclock),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    label = {
                        Text(text = "Focuse", color = if (isSelected == MainActivity.ROUTER.UserFocuse.name) Color(0xFF059BEE) else Color.Black)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF059BEE),
                        unselectedIconColor = Color.Black,
                        indicatorColor = Color.White
                    )
                )


                NavigationBarItem(
                    selected = isSelected == MainActivity.ROUTER.UserProfile.name,
                    onClick = {
                        isSelected = MainActivity.ROUTER.UserProfile.name
                        navController.navigate(MainActivity.ROUTER.UserProfile.name) {
                            popUpTo(navController.graph.startDestinationId) { inclusive = true }
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.user),
                            contentDescription = null,
                            modifier = Modifier.size(25.dp)
                        )
                    },
                    label = {
                        Text(text = "Profile", color = if (isSelected == MainActivity.ROUTER.UserProfile.name) Color(0xFF059BEE) else Color.Black)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFF059BEE),
                        unselectedIconColor = Color.Black,
                        indicatorColor = Color.White
                    )
                )
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(it)
        ) {
            Spacer(modifier = Modifier.height(1.dp))

            NavHost(
                navController = navController,
                startDestination = isSelected
            ) {
                composable(MainActivity.ROUTER.UserHome.name) {
                    UserHome(navHostController)
                }
                composable(MainActivity.ROUTER.UserCalendar.name) {
                    UserCalendar(navHostController)
                }
                composable(MainActivity.ROUTER.UserFocuse.name) {
                    UserFocuse(navHostController)
                }
                composable(MainActivity.ROUTER.UserProfile.name) {
                    UserProfile(navHostController)
                }
                composable(MainActivity.ROUTER.UserAdd.name) {
                    UserAdd(navHostController)
                }
            }
        }
    }
}
