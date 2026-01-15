package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.components.BattleRoundSelectionList

@Composable
fun BattleRoundSelectionScreenRoot(
    viewModel: BattleRoundSelectionScreenViewModel = viewModel(), //koinViewModel(),
    onBattleRoundClick: (BattleRound) -> Unit,
    modifier: Modifier = Modifier
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    BattleRoundSelectionScreen(
        state = state,
        onAction = { action ->
            when (action) {
                is BattleRoundSelectionScreenAction.OnBattleRoundSelected -> onBattleRoundClick(action.battleRound)
                else -> Unit
            }
            viewModel.onAction(action)
        },
    )
}

@Composable
fun BattleRoundSelectionScreen(
    state: BattleRoundSelectionScreenState,
    onAction: (BattleRoundSelectionScreenAction) -> Unit,
) {
    BattleRoundSelectionList(
        battleRounds = state.battleRounds,
        onButtonClick = {
            onAction(BattleRoundSelectionScreenAction.OnBattleRoundSelected(it))
        }
    )
}