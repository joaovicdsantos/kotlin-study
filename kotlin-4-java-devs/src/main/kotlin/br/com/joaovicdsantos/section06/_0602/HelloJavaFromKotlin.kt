package br.com.joaovicdsantos.section06._0602

fun main() {

    val cat = Animal("Garfield", "cat", 3)
    println(cat.show())

    val dog = Animal("Totó", "dog", 10)
    dog.weight = 12
    println(dog.show())

}