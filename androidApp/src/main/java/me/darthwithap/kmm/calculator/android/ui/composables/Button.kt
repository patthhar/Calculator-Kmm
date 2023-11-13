package me.darthwithap.kmm.calculator.android.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.darthwithap.kmm.calculator.domain.Key

@Composable
fun Button(
    modifier: Modifier = Modifier,
    key: Key,
    onClick: (Key) -> Unit
) {
    val keyText: String = when (key) {
        is Key.Operation.Plus -> "+"
        is Key.Operation.Minus -> "-"
        is Key.Operation.Multiply -> "x"
        is Key.Operation.Divide -> "/"
        is Key.Equals -> "="
        is Key.Clear -> "AC"
        is Key.Decimal -> "."
        is Key.Percentage -> "%"
        is Key.Parentheses -> "()"
        is Key.Backspace -> "⌫"
        is Key.Number -> key.number.toString()
    }

    Box(
        modifier = modifier
            .aspectRatio(1.3F)
            .clickable { onClick(key) },
    ) {
        Text(
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.Center)
                .clickable { onClick(key) },
            text = keyText,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    Button(
        modifier = Modifier,
        key = Key.Equals,
        onClick = {},
    )
}
