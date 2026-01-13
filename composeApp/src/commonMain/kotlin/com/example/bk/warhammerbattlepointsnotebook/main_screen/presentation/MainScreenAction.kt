package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation

sealed interface MainScreenAction {
    data class OnBattleRoundClick(val index: Int) : MainScreenAction
    data class OnTabSelected(val index: Int) : MainScreenAction
}