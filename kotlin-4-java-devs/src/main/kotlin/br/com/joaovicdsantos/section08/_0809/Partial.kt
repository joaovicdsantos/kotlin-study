package br.com.joaovicdsantos.section08._0809

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun main() {

    val prefixAndPostfix = { prefix: String, word: String, postfix: String -> "$prefix$word$postfix"}
    val prefixAndAlert = prefixAndPostfix.partially3("!")
    val hello = prefixAndAlert.partially1("Hello, ")

    println(prefixAndPostfix("in", "feliz", "mente"))
    println(prefixAndAlert("in", "feliz"))
    println(hello("infeliz"))

}