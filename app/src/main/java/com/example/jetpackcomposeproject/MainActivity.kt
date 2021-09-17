package com.example.jetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeproject.ui.theme.JetPackComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeProjectTheme {
                // A surface container using the 'background' color from the theme
                App()
            }
        }
    }
}

@Preview
@Composable
private fun App() {
    Column {
        TopAppBar(
            title = {
                Text(text = "JetPack Compose")
            },
            backgroundColor = colorResource(id = R.color.topAppBarColor)
        )

        Text(text = "Adebayo Oloyede, ")
        Text(text = "Welcome!")

        Button(onClick = { }) {
            Text(text = "Click Me")
        }
    }
}
