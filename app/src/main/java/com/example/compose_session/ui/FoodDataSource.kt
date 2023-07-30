package com.example.compose_session.ui

import com.example.compose_session.ui.screen.Meal
import com.example.compose_session.ui.screen.Restaurant

object FoodDataSource {

    val restaurants = listOf(
        Restaurant(

            "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/chorizo-mozarella-gnocchi-bake-cropped-9ab73a3.jpg?quality=90&resize=960,872"
        ),
        Restaurant(

            "https://anestisxasapotaverna.gr/wp-content/uploads/2021/12/ARTICLE-1.jpg"
        ),
        Restaurant(

            "https://interactive.wttw.com/sites/default/files/food-landing-page-hero_01.jpg"
        ), Restaurant(

            "https://interactive.wttw.com/sites/default/files/food-landing-page-hero_01.jpg"
        ), Restaurant(

            "https://interactive.wttw.com/sites/default/files/food-landing-page-hero_01.jpg"
        ), Restaurant(

            "https://interactive.wttw.com/sites/default/files/food-landing-page-hero_01.jpg"
        ), Restaurant(

            "https://interactive.wttw.com/sites/default/files/food-landing-page-hero_01.jpg"
        ), Restaurant(

            "https://interactive.wttw.com/sites/default/files/food-landing-page-hero_01.jpg"
        ),
        Restaurant(

            "https://a.cdn-hotels.com/gdcs/production0/d1513/35c1c89e-408c-4449-9abe-f109068f40c0.jpg?impolicy=fcrop&w=800&h=533&q=medium"
        ),
        Restaurant(

            "https://tekce.net/files/upload/images/spanish-best-cousines-1.jpg"
        )
    )

    val meals = listOf(
        Meal(
            "Humborgar",
            "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/chorizo-mozarella-gnocchi-bake-cropped-9ab73a3.jpg?quality=90&resize=960,872"
        ),
        Meal(
            "Seso",
            "https://anestisxasapotaverna.gr/wp-content/uploads/2021/12/ARTICLE-1.jpg"
        ),
        Meal(
            "Mozzela",
            "https://interactive.wttw.com/sites/default/files/food-landing-page-hero_01.jpg"
        ),
        Meal(
            "Nano",
            "https://a.cdn-hotels.com/gdcs/production0/d1513/35c1c89e-408c-4449-9abe-f109068f40c0.jpg?impolicy=fcrop&w=800&h=533&q=medium"
        ),
        Meal(
            "XYZZ",
            "https://tekce.net/files/upload/images/spanish-best-cousines-1.jpg"
        ),
        Meal(
            "Tmatemo",
            "https://wpstaq-ap-southeast-2-media.s3.amazonaws.com/liver-foundation/wp-content/uploads/media/2022/11/healthy-food.jpg"
        ),
        Meal(
            "Saryw",
            "https://static01.nyt.com/images/2021/02/17/dining/17tootired-grilled-cheese/17tootired-grilled-cheese-articleLarge.jpg?quality=75&auto=webp&disable=upscale"
        ),
        Meal(
            "Sandwatch",
            "https://www.eatthis.com/wp-content/uploads/sites/4/media/images/ext/796412456/grilled-cheese-tomato-soup.jpg?quality=82&strip=1"
        )
    )


}