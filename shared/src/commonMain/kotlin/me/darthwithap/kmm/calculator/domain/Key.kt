package me.darthwithap.kmm.calculator.domain

sealed class Key {
    sealed class Operation(open val operation: String) : Key() {
        data class Plus(override val operation: String = "+") : Operation(operation)
        data class Minus(override val operation: String = "-") : Operation(operation)
        data class Multiply(override val operation: String = "*") : Operation(operation)
        data class Divide(override val operation: String = "/") : Operation(operation)
    }

    data object Equals : Key()
    data object Clear : Key()
    data object Decimal : Key()
    data object Percentage : Key()
    data object Parentheses : Key()
    data object Backspace : Key()
    data class Number(val number: Int) : Key()
}