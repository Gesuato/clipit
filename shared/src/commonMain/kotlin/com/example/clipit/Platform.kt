package com.example.clipit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform