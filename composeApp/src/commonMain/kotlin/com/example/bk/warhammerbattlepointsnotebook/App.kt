package com.example.bk.warhammerbattlepointsnotebook


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenRoot
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreenRoot(
            viewModel = remember { MainScreenViewModel() },
            onTabClick = {

            }
        )
    }
}