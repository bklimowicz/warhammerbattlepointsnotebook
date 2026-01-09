package com.example.bk.warhammerbattlepointsnotebook

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform