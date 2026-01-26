package com.example.bk.warhammerbattlepointsnotebook.app


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenRoot
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    MaterialTheme {
        val viewModel = koinViewModel<MainViewModel>()

        MainScreenRoot(
            viewModel = viewModel
        )
    }
}