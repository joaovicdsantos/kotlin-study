package br.com.joaovicdsantos.section07._0704

import br.com.joaovicdsantos.section07._0703.Person

fun main() {

    val person = Person("Stan", "Lee")

    val kClass = person::class

    //println("Name = $kClass")
    println("Simple name = ${kClass.simpleName}")

    //for (fields in kClass.members) {
    //    println("Property name = $fields")
    //}

    for (fields in kClass.java.declaredFields) {
        //println("Property name = $fields")
        println("Property name = ${fields.name}")
    }


    for (constructor in kClass.constructors) {
        println("Constructor = $constructor")
        println("Constructor Return = ${constructor.returnType}")
        println("Constructor Parameters = ${constructor.parameters}")
    }

}