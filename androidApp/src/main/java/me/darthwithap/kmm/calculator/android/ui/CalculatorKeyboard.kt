package me.darthwithap.kmm.calculator.android.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.darthwithap.kmm.calculator.android.ui.composables.Button
import me.darthwithap.kmm.calculator.core.domain.Key

@Composable
fun CalculatorKeyboard(
    modifier: Modifier = Modifier,
    onClick: (Key) -> Unit,
) {
    Box(modifier = modifier) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Button(modifier = Modifier.weight(1F), key = Key.Clear, onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Backspace, onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Percentage, onClick = onClick)
                Button(
                    modifier = Modifier.weight(1F),
                    key = Key.Operation.Plus(),
                    onClick = onClick
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Button(modifier = Modifier.weight(1F), key = Key.Number(7), onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Number(8), onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Number(9), onClick = onClick)
                Button(
                    modifier = Modifier.weight(1F),
                    key = Key.Operation.Multiply(),
                    onClick = onClick
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Button(modifier = Modifier.weight(1F), key = Key.Number(4), onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Number(5), onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Number(6), onClick = onClick)
                Button(
                    modifier = Modifier.weight(1F),
                    key = Key.Operation.Minus(),
                    onClick = onClick
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Button(modifier = Modifier.weight(1F), key = Key.Number(1), onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Number(2), onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Number(3), onClick = onClick)
                Button(
                    modifier = Modifier.weight(1F),
                    key = Key.Operation.Plus(),
                    onClick = onClick
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Button(modifier = Modifier.weight(1F), key = Key.Decimal, onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Number(0), onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Parentheses, onClick = onClick)
                Button(modifier = Modifier.weight(1F), key = Key.Equals, onClick = onClick)
            }
        }
    }
}

@Preview
@Composable
fun CalculatorKeyboardPreview() {
    CalculatorKeyboard(
        modifier = Modifier,
        onClick = { },
    )
}