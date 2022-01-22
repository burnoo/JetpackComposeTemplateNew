package dev.burnoo.template.composable

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import dev.burnoo.template.R

@Composable
fun TopBar() {
    CenterAlignedTopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) }
    )
}