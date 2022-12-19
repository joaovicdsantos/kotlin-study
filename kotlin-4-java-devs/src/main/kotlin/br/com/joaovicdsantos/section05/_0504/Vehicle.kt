package br.com.joaovicdsantos.section05._0504

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Vruuumm")
    }

    fun stop() {
        println("*breake noise*")
    }

    fun getKmPerLiter(): Int = 17

    fun getDoors(): Int

}