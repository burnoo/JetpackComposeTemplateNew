package dev.burnoo.template.features.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.burnoo.template.ui.composables.AppScaffold

@Composable
internal fun MainScreen() {
    AppScaffold(
        title = { Text(text = stringResource(id = R.string.title)) },
    ) { padding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            HelloButton()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HelloButton() {
    Button(onClick = {}) {
        Text("Hello @burnoo")
    }
}