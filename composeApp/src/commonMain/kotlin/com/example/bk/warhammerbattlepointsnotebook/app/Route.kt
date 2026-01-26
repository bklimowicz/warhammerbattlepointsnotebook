package com.example.bk.warhammerbattlepointsnotebook.app

import androidx.navigation3.runtime.NavKey
import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound
import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object MainScreen : NavKey

    @Serializable
    data class BattleRoundScreen(val battleRoundId: Int, val playerId: Int) : NavKey
}