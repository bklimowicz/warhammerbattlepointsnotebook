package com.example.bk.warhammerbattlepointsnotebook

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreen
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenState
import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.BattleRoundSelectionScreen
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.BattleRoundSelectionScreenState
import org.jetbrains.compose.resources.stringResource
import warhammerbattlepointsnotebook.composeapp.generated.resources.Res
import warhammerbattlepointsnotebook.composeapp.generated.resources.test

private val battleRounds = (1..5).map {
    BattleRound(roundNumber = it)
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen(
        state = MainScreenState(
            selectedTabIndex = 0
        ),
        onAction = {}
    )
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

//@Preview()
//@Composable
//private fun Test() {
//    Text(
//        text = stringResource(Res.string.test),
//        fontSize = 50.sp,
//        color = Color.White,
//    )
//}