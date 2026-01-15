package com.example.bk.warhammerbattlepointsnotebook.app


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenRoot
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    MaterialTheme {
        val viewModel = koinViewModel<MainScreenViewModel>()
        val navController = rememberNavController()

        MainScreenRoot(
            viewModel = viewModel,
            onBattleRoundClick = {

            }
        )
    }
}