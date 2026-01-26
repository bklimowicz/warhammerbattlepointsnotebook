package com.example.bk.warhammerbattlepointsnotebook.player.domain

data class Player(
    val id: Int,
    val name: String,
    val pointsTotal: Int = 0,
    val commandPoints: Int = 0,
)