package com.example.bk.warhammerbattlepointsnotebook.app

import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound
import kotlinx.serialization.Serializable

sealed interface Route {
    //@Serializable
    data object MainScreen : Route

    //@Serializable
    data class BattleRoundScreen(val battleRound: BattleRound) : Route
}