package com.laurentvrevin.swipeswipe.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.font.FontWeight
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
                    color = randomColor()
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
        if (cards.isEmpty()) {
            Text(
                text = "List empty",
                style = TextStyle(
                    fontSize = 64.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Gray
                ),
                modifier = Modifier.align(Alignment.Center)
            )
        } else {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 48.dp, start = 24.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Left : $leftSwipes",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Right : $rightSwipes",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
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
}
enum class SwipeDirection {
    LEFT,
    RIGHT
}