package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel: ViewModel() {
    private val _state = MutableStateFlow(GameState(0))
    val state = _state.asStateFlow()

    fun onAction(action: MainScreenAction) {
        when (action) {
            is MainScreenAction.OnBattleRoundClick -> {
                //_state.update { it.copy(selectedTabIndex = action.index)}
            }
            is MainScreenAction.OnTabSelected -> {
                _state.update {
                    it.copy(selectedTabIndex = action.index, activePlayerId = action.index + 1)
                }
            }

            MainScreenAction.GoBack -> TODO()
        }
    }
}