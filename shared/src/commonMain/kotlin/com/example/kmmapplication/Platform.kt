package com.example.kmmapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform