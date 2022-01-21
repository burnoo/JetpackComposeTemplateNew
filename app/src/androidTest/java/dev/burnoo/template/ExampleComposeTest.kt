package dev.burnoo.template

import androidx.compose.material3.Text
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class ExampleComposeTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun exampleTest() {
        val text = "Hello Compose Test!"
        composeRule.setContent {
            Text(text)
        }

        composeRule.onNode(hasText(text)).assertExists()
    }
}