package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.bk.warhammerbattlepointsnotebook.core.presentation.DarkBlue
import com.example.bk.warhammerbattlepointsnotebook.core.presentation.DesertWhite
import com.example.bk.warhammerbattlepointsnotebook.core.presentation.SandYellow
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.components.AppIcon
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.components.MainScreenTab
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.BattleRoundSelectionScreen
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.BattleRoundSelectionScreenAction
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.BattleRoundSelectionScreenRoot
import com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_selection_screen.BattleRoundSelectionScreenViewModel
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import warhammerbattlepointsnotebook.composeapp.generated.resources.Res
import warhammerbattlepointsnotebook.composeapp.generated.resources.player1
import warhammerbattlepointsnotebook.composeapp.generated.resources.player2


@Composable
fun MainScreenRoot(
    viewModel: MainScreenViewModel = koinViewModel(),
    onTabClick: (Int) -> Unit,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    Scaffold(
        modifier = Modifier.safeContentPadding()
    ) {
        MainScreen(
            state = state,
            onAction = { action ->
                when (action) {
                    is MainScreenAction.OnIndexChanged -> onTabClick(action.index)
                    else -> Unit
                }
                viewModel.onAction(action)
            }
        )
    }
}

@Composable
fun MainScreen(
    state: MainScreenState,
    onAction: (MainScreenAction) -> Unit,
) {
    val pagerState = rememberPagerState {
        2
    }

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .safeContentPadding()
                .background(DarkBlue)
        ) {
            AppIcon()
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                color = Color.White,
                shape = RoundedCornerShape(
                    topStart = 32.dp,
                    topEnd = 32.dp,
                )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    PrimaryTabRow(
                        selectedTabIndex = state.selectedTabIndex,
                        modifier = Modifier
                            .padding(vertical = 12.dp)
                            .widthIn(max = 700.dp)
                            .fillMaxWidth(),
                        containerColor = DesertWhite,
                        contentColor = SandYellow,
                        indicator = {
                            TabRowDefaults.SecondaryIndicator(
                                color = SandYellow
                            )
                        }
                    ) {
                        Tab(
                            selected = state.selectedTabIndex == 0,
                            onClick = { onAction(MainScreenAction.OnIndexChanged(0) )},
                            modifier = Modifier.weight(1f),
                            selectedContentColor = SandYellow,
                            unselectedContentColor = Color.Black.copy(alpha = 0.5f),
                        ) {
                            Text(
                                text = stringResource(Res.string.player1),
                                modifier = Modifier
                                    .padding(vertical = 12.dp),
                                fontSize = 20.sp,
                            )
                        }
                        Tab(
                            selected = state.selectedTabIndex == 1,
                            onClick = { onAction(MainScreenAction.OnIndexChanged(1) )},
                            modifier = Modifier.weight(1f),
                            selectedContentColor = SandYellow,
                            unselectedContentColor = Color.Black.copy(alpha = 0.5f),
                        ) {
                            Text(
                                text = stringResource(Res.string.player2),
                                modifier = Modifier
                                    .padding(vertical = 12.dp),
                                fontSize = 20.sp,
                            )
                        }
//                        MainScreenTab(
//                            text = Res.string.player1,
//                            modifier = Modifier
//                                .weight(1f),
//                            selectedTabIndex = 0,
//                            state = state,
//                            onClick = { onAction(MainScreenAction.OnIndexChanged(0) )},
//                        )
//                        MainScreenTab(
//                            text = Res.string.player2,
//                            modifier = Modifier
//                                .weight(1f),
//                            selectedTabIndex = 1,
//                            state = state,
//                            onClick = { onAction(MainScreenAction.OnIndexChanged(1) )},
//                        )
                    }
                }
                Spacer(Modifier.height(8.dp))
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) { pageIndex ->
                    when(pageIndex) {
                        0 -> {
                            BattleRoundSelectionScreenRoot(
                                BattleRoundSelectionScreenViewModel(),
                                onBattleRoundClick = {}
                            )
                        }
                        1 -> {
                            BattleRoundSelectionScreenRoot(
                                BattleRoundSelectionScreenViewModel(),
                                onBattleRoundClick = {}
                            )
                        }
                    }
                }
            }
        }
    }
}