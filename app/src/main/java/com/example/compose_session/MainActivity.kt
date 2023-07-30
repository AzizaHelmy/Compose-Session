package com.example.compose_session

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Shaw()
        }

    }
}

@Composable
fun Shaw() {
    Box (contentAlignment = Alignment.Center){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = ""
        )

        Text(text = "Aziza", fontSize = 24.sp,)
    }

}

@Preview
@Composable
fun PreviewText() {
    Shaw()
}