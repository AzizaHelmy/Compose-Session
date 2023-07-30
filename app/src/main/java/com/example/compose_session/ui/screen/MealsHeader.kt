package com.example.compose_session.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compose_session.ui.theme.CardBackgroundColor

@Composable
fun MealsHeader(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .background(CardBackgroundColor)
            .padding(16.dp)

    )
}