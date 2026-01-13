package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen

import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound

sealed interface BattleRoundSelectionScreenAction {
    data class OnBattleRoundSelected(val battleRound: BattleRound) : BattleRoundSelectionScreenAction

}
