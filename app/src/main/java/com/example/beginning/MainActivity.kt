package com.example.beginning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.beginning.ui.theme.BeginningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeginningTheme {
                // A surface container using the 'background' color from the theme
                Greeting()
            }
        }
    }


    @Composable
    fun Greeting() {
        var myValue by remember { mutableStateOf(false) }
        Button(onClick = { myValue = !myValue }) {
            Text(text = "Sign Up")


        }

    }

    @Composable
    @Preview
    fun GreetingPreview() {
        BeginningTheme {

            Greeting()
        }


    }
}