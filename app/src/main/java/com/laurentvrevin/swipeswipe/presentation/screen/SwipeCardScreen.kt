package com.laurentvrevin.swipeswipe.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.laurentvrevin.swipeswipe.domain.model.CardData
import com.laurentvrevin.swipeswipe.presentation.component.SwipeableCard
import com.laurentvrevin.swipeswipe.util.randomColor

@Composable
fun SwipeCardScreen(modifier: Modifier) {

    val cards = remember {
        mutableStateListOf(
            *List(30) { index ->
                CardData(
                    id = index + 1,
                    content = "Card ${index + 1}",
                    color = randomColor() // Couleur aléatoire
                )
            }.toTypedArray()
        )
    }


    var leftSwipes by remember { mutableIntStateOf(0) }
    var rightSwipes by remember { mutableIntStateOf(0) }


    fun onCardSwiped(card: CardData, direction: SwipeDirection) {
        cards.remove(card)
        when (direction) {
            SwipeDirection.LEFT -> leftSwipes++
            SwipeDirection.RIGHT -> rightSwipes++
        }
    }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE))
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Swipes à gauche : $leftSwipes",
                style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp, color = Color.Red)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Swipes à droite : $rightSwipes",
                style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp, color = Color.Green)
            )
        }


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp)
        ) {
            cards.reversed().forEach { card ->
                SwipeableCard(
                    cardData = card,
                    modifier = Modifier.fillMaxSize(),
                    onSwipeLeft = { onCardSwiped(card, SwipeDirection.LEFT) },
                    onSwipeRight = { onCardSwiped(card, SwipeDirection.RIGHT) }
                )
            }
        }
    }
}
enum class SwipeDirection {
    LEFT,
    RIGHT
}