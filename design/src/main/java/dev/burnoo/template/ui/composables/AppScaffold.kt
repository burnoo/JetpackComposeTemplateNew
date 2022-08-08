package dev.burnoo.template.ui.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun AppScaffold(
    title: @Composable () -> Unit,
    content: @Composable (padding: PaddingValues) -> Unit,
) {
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = title) },
        content = content
    )
}