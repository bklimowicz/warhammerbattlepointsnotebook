package com.example.bk.warhammerbattlepointsnotebook.player.presentation.battle_round_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BattleRoundScreen(
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = Modifier
            //.weight(1f)
            .fillMaxWidth(),
        color = Color.White,
        shape = RoundedCornerShape(
            topStart = 32.dp,
            topEnd = 32.dp,
        )
    ) {
        Row() {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                contentDescription = null,
                modifier = Modifier.size(64.dp),
                tint = Color.Black
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                "Primary points:",
                fontSize = 30.sp
                )
            TextField("", onValueChange = {})
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                "Secondary points:",
                fontSize = 30.sp
            )
            TextField("", onValueChange = {})
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                "Challenger points:",
                fontSize = 30.sp,
            )
            TextField("", onValueChange = {})
        }
    }
}
