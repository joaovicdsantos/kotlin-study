package br.com.joaovicdsantos.section05._0503

fun main() {

    val location1 = object {
        val xCoordinate = 200
        val yCoordinate = 400
    }
    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    // Object type
    val location = object {
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }
    location.printIt()
    location.yCoordinate = 3000
    location.yCoordinate = 6000
    location.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last temperature measured = $temperature degrees")
}

// Object declaration
object MySingleton {
    var temperatures = arrayOf(24, 28, 29)
    fun getLastTemperature() = temperatures.last()
}