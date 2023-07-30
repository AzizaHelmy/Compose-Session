package com.example.compose_session.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_session.ui.FoodDataSource

/**
 * Created by Aziza on 7/30/2023.
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FoodScreen() {
    LazyColumn(
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        stickyHeader { MealsHeader(title = "Restaurants:") }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                itemsIndexed(FoodDataSource.restaurants) { index, item ->
                    RestaurantItem(restaurant = item)
                }
            }
        }

        stickyHeader { MealsHeader(title = "Meals:") }

        items(FoodDataSource.meals) {
            MealItem(meal = it, onClick = {})
        }
        stickyHeader { MealsHeader(title = "Restaurants:") }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                itemsIndexed(FoodDataSource.restaurants) { index, item ->
                    RestaurantItem(restaurant = item)
                }
            }
        }
    }

}

@Composable
fun LazyColumnFoodContent() {
    LazyColumn(
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(FoodDataSource.meals) {
            MealItem(meal = it, onClick = {})
        }
    }
}

@Composable
fun LazyRowFoodContent() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        itemsIndexed(FoodDataSource.restaurants) { index, item ->
            RestaurantItem(restaurant = item)
        }
    }
}

@Composable
private fun LazyGridFoodContent() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        items(FoodDataSource.restaurants) {
            RestaurantItem(restaurant = it)
        }
    }
}


@Preview
@Composable
fun PreviewFoodSScreen() {
    //FoodScreen()
    LazyColumnFoodContent()
    // LazyRowFoodContent()
    //LazyGridFoodContent()
}