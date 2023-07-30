package com.example.compose_session.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

/**
 * Created by Aziza on 7/30/2023.
 */
@Composable
fun RestaurantItem(restaurant: Restaurant) {

    Image(
        painter = rememberAsyncImagePainter(model = restaurant.imageUrl),
        contentDescription = "RestaurantItem Image",
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center,
        modifier = Modifier
            .size(96.dp)
            .clip(CircleShape)
            .background(
                color = Color(0xFFF8F8F8F)
            ),
    )

}