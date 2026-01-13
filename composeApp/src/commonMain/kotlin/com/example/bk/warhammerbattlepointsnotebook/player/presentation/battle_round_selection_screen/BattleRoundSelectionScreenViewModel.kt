package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BattleRoundSelectionScreenViewModel : ViewModel() {
    private val _state = MutableStateFlow(BattleRoundSelectionScreenState())
    val state = _state.asStateFlow()

    fun onAction(action: BattleRoundSelectionScreenAction) {
        when (action) {
            is BattleRoundSelectionScreenAction.OnBattleRoundSelected -> {
                _state.update { it.copy(selectedBattleRound = action.battleRound)}
            }
        }
    }
}