package br.com.joaovicdsantos.section04

import kotlin.random.Random

fun main() {

    /*
        If é a maneira mais básica de conrle de fluxo em Kotlin.
        If é uma expressão e não uma instrução
         - O valor de retorno é o valor da última expressão;
         - Declaração ternária desnecessária; // eu acho mais bonito, seria redudante, mas...

        Statement instruções de programa que não retornam nenhum valor; Não pode estar do
        lado direito de um sinal de igual

        Expression instruções de programa que retornam valores; pode estar no lado direito
        de um sinal de igual.
    */

    val myInt = Random.nextInt(0, 100)
    val aInt = Random.nextInt(0, 100)

    // Java: int lowest = (myInt < aInt) ? myInt : aInt;
    val lowest = if (myInt < aInt) myInt else aInt // É obrigatório a existência do else

    val temp = Random.nextInt(15, 30)
    val isAirConditionerOn = if (temp >= 26) {
        println("It's warm")
        true
    } else {
        println("It isn't so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")


}