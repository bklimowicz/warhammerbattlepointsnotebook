package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bk.warhammerbattlepointsnotebook.core.presentation.SandYellow
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenAction
import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenState
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun MainScreenTab(
    text: StringResource,
    modifier: Modifier = Modifier,
    state: MainScreenState,
    selectedTabIndex: Int,
    onClick: () -> Unit,
) {
    Tab(
        selected = state.selectedTabIndex == selectedTabIndex,
        onClick = onClick,
        modifier = modifier,
        selectedContentColor = SandYellow,
        unselectedContentColor = Color.Black.copy(alpha = 0.5f),
    ) {
        Text(
            text = stringResource(text),
            modifier = Modifier
                .padding(vertical = 12.dp),
            fontSize = 20.sp,
        )
    }
}