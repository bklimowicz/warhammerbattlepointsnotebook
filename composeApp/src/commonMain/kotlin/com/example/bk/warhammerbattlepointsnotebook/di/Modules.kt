package com.example.bk.warhammerbattlepointsnotebook.di

import com.example.bk.warhammerbattlepointsnotebook.main_screen.presentation.MainViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val sharedModule = module {
    viewModelOf(::MainViewModel)
}