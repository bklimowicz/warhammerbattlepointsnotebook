package com.example.bk.warhammerbattlepointsnotebook

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.bk.warhammerbattlepointsnotebook.core.presentation.DarkBlue
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreen
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenAction
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenViewModel
import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_screen.BattleRoundScreen

private val battleRounds = (1..5).map {
    BattleRound(roundNumber = it)
}

@Preview
@Composable
private fun MainScreenPreview() {
    val viewModel = MainScreenViewModel()
    val onTabClick: (BattleRound) -> Unit = {}
    val state by viewModel.state.collectAsStateWithLifecycle()
    MainScreen(
        state = state,
        onAction = { action ->
            when (action) {
                is MainScreenAction.OnBattleRoundClick -> onTabClick(action.battleRound)
                else -> Unit
            }
            viewModel.onAction(action)
        }
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF0B405E)
@Composable
private fun BattleRoundScreenPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlue)
            .statusBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BattleRoundScreen()
    }
}




//
//@Preview(showBackground = true, backgroundColor = 0xFF0B405E)
//@Composable
//private fun BattleRoundSelectionScreenPreview() {
//    BattleRoundSelectionScreen(
//        state = BattleRoundSelectionScreenState(
//            battleRounds = battleRounds
//        ),
//        onAction = {}
//    )
//}