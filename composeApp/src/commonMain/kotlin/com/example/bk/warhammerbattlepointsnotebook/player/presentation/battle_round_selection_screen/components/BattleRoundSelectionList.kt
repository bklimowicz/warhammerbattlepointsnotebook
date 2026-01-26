package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound

@Composable
fun BattleRoundSelectionList(
    battleRounds: List<BattleRound>,
    playerId: Int,
    onButtonClick: (BattleRound) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        BattleRoundSelectionButton(
            battleRounds[0],
            onClick = { onButtonClick(battleRounds[0]) },
            modifier = Modifier
        )
        BattleRoundSelectionButton(
            battleRounds[1],
            onClick = { onButtonClick(battleRounds[1]) },
            modifier = Modifier
                .height(IntrinsicSize.Max)
        )
        BattleRoundSelectionButton(
            battleRounds[2],
            onClick = { onButtonClick(battleRounds[2]) },
            modifier = Modifier
                .height(IntrinsicSize.Min)
        )
        BattleRoundSelectionButton(
            battleRounds[3],
            onClick = { onButtonClick(battleRounds[3]) },
            modifier = Modifier
                .height(IntrinsicSize.Min)
        )
        BattleRoundSelectionButton(
            battleRounds[4],
            onClick = { onButtonClick(battleRounds[4]) },
            modifier = Modifier
                .height(IntrinsicSize.Min)
        )
    }
}