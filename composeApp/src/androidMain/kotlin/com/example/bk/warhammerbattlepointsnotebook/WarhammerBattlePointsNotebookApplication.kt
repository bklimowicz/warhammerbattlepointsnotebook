package com.example.bk.warhammerbattlepointsnotebook

import android.app.Application
import com.example.bk.warhammerbattlepointsnotebook.di.initKoin

class WarhammerBattlePointsNotebookApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}