package br.com.joaovicdsantos.section03

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "World"
    println("Hello, $name!")
}