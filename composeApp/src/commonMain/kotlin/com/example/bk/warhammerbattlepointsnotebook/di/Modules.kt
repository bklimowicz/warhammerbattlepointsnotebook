package com.example.bk.warhammerbattlepointsnotebook.di

import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainScreenViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val sharedModule = module {
    viewModelOf(::MainScreenViewModel)
}