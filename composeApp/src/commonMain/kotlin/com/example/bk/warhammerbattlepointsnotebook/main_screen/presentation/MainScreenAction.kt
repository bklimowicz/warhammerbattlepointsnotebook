package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation

sealed interface MainScreenAction {
    data class OnIndexChanged(val index: Int) : MainScreenAction
}