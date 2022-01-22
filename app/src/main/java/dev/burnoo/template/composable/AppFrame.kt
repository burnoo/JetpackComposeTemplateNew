package dev.burnoo.template.composable

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import dev.burnoo.template.ui.theme.TemplateTheme

@Composable
fun AppFrame(content: @Composable () -> Unit) {
    TemplateTheme {
        Scaffold(topBar = { TopBar() }) {
            content()
        }
    }
}