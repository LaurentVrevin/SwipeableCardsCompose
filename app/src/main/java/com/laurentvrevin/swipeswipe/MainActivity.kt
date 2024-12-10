package com.laurentvrevin.swipeswipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.laurentvrevin.swipeswipe.presentation.screen.SwipeCardScreen
import com.laurentvrevin.swipeswipe.presentation.theme.SwipeSwipeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SwipeSwipeTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 48.dp)
                ) { innerPadding ->
                    SwipeCardScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}


