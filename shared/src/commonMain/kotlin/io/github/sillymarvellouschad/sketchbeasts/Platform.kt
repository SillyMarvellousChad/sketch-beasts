package io.github.sillymarvellouschad.sketchbeasts

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform