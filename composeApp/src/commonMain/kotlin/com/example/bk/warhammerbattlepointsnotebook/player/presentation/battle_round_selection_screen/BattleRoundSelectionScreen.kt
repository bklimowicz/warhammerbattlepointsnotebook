package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenAction
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainViewModel
import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.components.BattleRoundSelectionList
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun BattleRoundSelectionScreen(
    battleRounds: List<BattleRound>,
    activePlayerId: Int,
    onAction: (MainScreenAction) -> Unit,
) {
    BattleRoundSelectionList(
        battleRounds = battleRounds,
        playerId = activePlayerId,
        onButtonClick = { battleRound ->
            onAction(MainScreenAction.OnBattleRoundClick(battleRound.id, activePlayerId))
        }
    )
}