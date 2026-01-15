package com.example.bk.warhammerbattlepointsnotebook.app


import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenRoot
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = Route.MainScreen
        ) {
            navigation<Route.MainScreen> (
                startDestination = Route.MainScreen
            ) {
                composable<Route.MainScreen>(
                    exitTransition = { slideOutHorizontally() },
                    popEnterTransition = { slideInHorizontally() }
                ) {
                    val viewModel = viewModel<MainScreenViewModel>()
                    val selectedBattleROundViewModel = it.

                    MainScreenRoot(
                        viewModel = remember { MainScreenViewModel() },
                        onBattleRoundClick = {

                        }
                    )
                }
            }
        }
    }
}