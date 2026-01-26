package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation

import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound

sealed interface MainScreenAction {
    data class OnBattleRoundClick(val battleRoundId: Int, val playerId: Int) : MainScreenAction
    data class OnTabSelected(val index: Int) : MainScreenAction
    data object GoBack : MainScreenAction
}