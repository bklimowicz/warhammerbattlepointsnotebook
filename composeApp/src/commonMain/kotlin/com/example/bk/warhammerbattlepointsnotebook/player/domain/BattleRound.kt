package com.example.bk.warhammerbattlepointsnotebook.player.domain

data class BattleRound(
    val roundNumber: Int,
    val primaryPoints: Int = 0,
    val secondaryPoints: Int = 0,
    val challengerPoints: Int = 0,
    val pointsTotal: Int = 0,
)
