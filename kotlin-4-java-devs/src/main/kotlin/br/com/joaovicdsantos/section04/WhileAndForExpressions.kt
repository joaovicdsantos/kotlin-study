package br.com.joaovicdsantos.section04

fun main() {

    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    /*
    Um loop for clássico contém:
        1. Inicializador do loop;
        2. Verificador do loop;
        3. Iterador do loop;
        4. Corpo do loop.
    */
    for (item in 1..10) { // item é val
        print("$item, ")
    }
    println()

    for (ch in "joaovicdsantos") {
        print("$ch ")
    }

}