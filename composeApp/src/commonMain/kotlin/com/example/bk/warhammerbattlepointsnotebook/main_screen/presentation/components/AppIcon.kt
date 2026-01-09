package com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun AppIcon() {
    Text(
        text = "Placeholder for icon",
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontSize = 50.sp,
        lineHeight = 60.sp
    )
}