package io.github.sillymarvellouschad.sketchbeasts

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}