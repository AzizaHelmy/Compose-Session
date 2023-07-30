package com.example.compose_session.ui.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.compose_session.ui.theme.CardBackgroundColor

/**
 * Created by Aziza on 7/30/2023.
 */
@Composable
fun MealItem(meal: Meal, onClick: () -> Unit, modifier: Modifier = Modifier) {

    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(modifier = modifier.clickable { onClick() }) {
            Image(
                painter = rememberAsyncImagePainter(model = meal.imageUrl),
                contentDescription = "Food Image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Text(
                text = meal.name,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(CardBackgroundColor)
                    .padding(16.dp)

            )
        }
    }
}

@Preview
@Composable
fun PreviewMealItem() {
    MealItem(Meal(), onClick = {})
}