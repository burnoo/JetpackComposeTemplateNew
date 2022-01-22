package dev.burnoo.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.burnoo.template.composable.AppFrame
import dev.burnoo.template.composable.AppNavHost

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFrame { AppNavHost() }
        }
    }
}