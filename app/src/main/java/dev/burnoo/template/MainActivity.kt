package dev.burnoo.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.burnoo.template.ui.composable.app.AppFrame
import dev.burnoo.template.ui.composable.home.HomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFrame { HomeScreen() }
        }
    }
}