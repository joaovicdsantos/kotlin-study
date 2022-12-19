package br.com.joaovicdsantos.section04

fun main() {

    println("10 + 20 = ${myMathFunction(10, 20)}")

    println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")

    println("20 + 35 = ${myExpressionBodyFunctionWithInference(20, 35)}")

    println("10 + 10 = ${myFunctionWithDefaults(10, 10, "Hello")}")
    println("Default SUM = ${myFunctionWithDefaults(message = "Hallo")}")

}

fun myMathFunction(number1: Int, number2: Int) : Int {
    return number1 + number2
}

fun myExpressionBodyFunction(number1: Int, number2: Int) : Int = number1 + number2 // Tipo o scala consegue fazer

fun myExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2 // Não precisa especificar o tipo de retorno

fun myFunctionWithDefaults(number1: Int = 1, number2: Int = 5, message: String = "Hi") : Int {
    val result = number1 + number2
    println(message)
    return result
}