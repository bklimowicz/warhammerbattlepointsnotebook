package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen

import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound

data class BattleRoundSelectionScreenState(
    val battleRounds: List<BattleRound> = listOf(
        BattleRound(1),
        BattleRound(2),
        BattleRound(3),
        BattleRound(4),
        BattleRound(5),
    ),
    val selectedBattleRound: BattleRound? = null
)
