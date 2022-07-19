package com.task.composecalculator

sealed class CalculatorActions {
    data class Number(val number: Int) : CalculatorActions()
    object Clear : CalculatorActions()
    object Decimal : CalculatorActions()
    object Calculate : CalculatorActions()
    data class Operations(val operation: CalculatorOperations) : CalculatorActions()
}
