package io.github.sillymarvellouschad.sketchbeasts

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SketchBeasts",
    ) {
        App()
    }
}