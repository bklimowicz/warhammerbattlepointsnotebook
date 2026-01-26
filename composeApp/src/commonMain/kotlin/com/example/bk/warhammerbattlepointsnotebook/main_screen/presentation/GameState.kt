package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation

import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound
import com.example.bk.warhammerbattlepointsnotebook.player.domain.Player

data class GameState(
    val selectedTabIndex: Int = 0,
    val activePlayerId: Int = 0,
    val battleRounds: List<BattleRound> = listOf(
        BattleRound(1, 1),
        BattleRound(2, 2),
        BattleRound(3, 3),
        BattleRound(4, 4),
        BattleRound(5, 5),
    ),
    val players: List<Player> = listOf(
        Player(1, "Player 1"),
        Player(2, "Player 2"),
    ),
)