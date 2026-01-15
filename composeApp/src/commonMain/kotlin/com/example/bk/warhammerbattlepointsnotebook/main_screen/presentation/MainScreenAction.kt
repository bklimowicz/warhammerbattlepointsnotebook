package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation

import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound

sealed interface MainScreenAction {
    data class OnBattleRoundClick(val battleRound: BattleRound) : MainScreenAction
    data class OnTabSelected(val index: Int) : MainScreenAction
}