package br.com.joaovicdsantos.section08._0806

import org.funktionale.collections.destructured

fun main() {
    val (head, tail) = listOf(1, 2, 3).destructured()
    println("Head = $head and Tail = $tail")
}