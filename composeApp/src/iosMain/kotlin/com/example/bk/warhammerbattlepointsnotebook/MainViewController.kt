package com.example.bk.warhammerbattlepointsnotebook

import androidx.compose.ui.window.ComposeUIViewController
import com.example.bk.warhammerbattlepointsnotebook.app.App
import com.example.bk.warhammerbattlepointsnotebook.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}