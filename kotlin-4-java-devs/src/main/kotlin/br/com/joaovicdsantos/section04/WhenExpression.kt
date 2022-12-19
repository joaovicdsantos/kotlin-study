package br.com.joaovicdsantos.section04

import kotlin.random.Random

fun main() {

    /*
    É tipo o Switch.
    */

    val pizzasOrdered = Random.nextInt(0, 10)
    println("Pizzas Ordered: $pizzasOrdered")

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        in 1..4 -> println("Hungry")
        in 5.. 9 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }

}