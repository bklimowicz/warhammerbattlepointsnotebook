package com.example.bk.warhammerbattlepointsnotebook

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreen
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenAction
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenViewModel
import com.example.bk.warhammerbattlepointsnotebook.player.domain.BattleRound

private val battleRounds = (1..5).map {
    BattleRound(roundNumber = it)
}

@Preview
@Composable
private fun MainScreenPreview() {
    val viewModel = MainScreenViewModel()
    val onTabClick: (Int) -> Unit = {}
    val state by viewModel.state.collectAsStateWithLifecycle()
    MainScreen(
        state = state,
        onAction = { action ->
            when (action) {
                is MainScreenAction.OnBattleRoundClick -> onTabClick(action.index)
                else -> Unit
            }
            viewModel.onAction(action)
        }
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