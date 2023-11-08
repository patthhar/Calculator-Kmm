package me.darthwithap.kmm.calculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform