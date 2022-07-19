package com.task.composecalculator

sealed class CalculatorOperations(val symbol: String) {
    object Add : CalculatorOperations("+")
    object Subtract : CalculatorOperations("-")
    object Multiply : CalculatorOperations("*")
    object Divide : CalculatorOperations("/")
}
