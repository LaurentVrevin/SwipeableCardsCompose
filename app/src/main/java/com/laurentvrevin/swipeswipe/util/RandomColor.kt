package com.laurentvrevin.swipeswipe.util

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

fun randomColor(): Color {
    return Color(
        red = Random.nextFloat(),
        green = Random.nextFloat(),
        blue = Random.nextFloat(),
        alpha = 1f
    )
}