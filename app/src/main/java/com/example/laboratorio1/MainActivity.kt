package com.example.laboratorio1

import android.util.Log
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio1.ui.theme.Laboratorio1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio1Theme {
                // A simple screen with a column containing texts and a button
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen() {
    var buttonText by remember { mutableStateOf("Press me") }

    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2 prueba")
        Text(text = "Texto 3 Intento")

        Button(onClick = {
            buttonText = "Da click aqui"
            Log.d("Button", "Bien hecho")
        }) {
            Text(text = buttonText)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Laboratorio1Theme {
        MyScreen()
    }
}
