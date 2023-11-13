package me.darthwithap.kmm.calculator.android.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.darthwithap.kmm.calculator.core.domain.Key

@Composable
fun CalculatorScreen(
    modifier: Modifier = Modifier
) {
    var input by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        CalculatorDisplay(input = "", result = "")
        CalculatorKeyboard(onClick = { key ->
            input = when (key) {
                is Key.Number -> input + key.number
                is Key.Operation -> input + key.operation
                Key.Clear -> ""
                Key.Backspace -> input.dropLast(1)
                Key.Equals -> evaluateExpression(input)
                else -> input
            }
        })
    }
}

@Preview
@Composable
fun CalculatorScreenPreview() {
    CalculatorScreen()
}

// TODO: Hacky evaluateExpression, to be moved and written in a usecase
private fun evaluateExpression(input: String) = input