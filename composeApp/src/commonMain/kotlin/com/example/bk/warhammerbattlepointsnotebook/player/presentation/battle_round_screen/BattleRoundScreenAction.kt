package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_screen

sealed interface BattleRoundScreenAction {
    data class OnPrimaryPointsChanged(val round: Int) : BattleRoundScreenAction
    data class OnSecondaryPointsChanged(val round: Int) : BattleRoundScreenAction
    data class OnChallengerPointsChanged(val round: Int) : BattleRoundScreenAction
}