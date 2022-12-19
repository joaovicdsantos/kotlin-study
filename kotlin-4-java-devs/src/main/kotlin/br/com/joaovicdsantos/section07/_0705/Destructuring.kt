package br.com.joaovicdsantos.section07._0705


fun main() {

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    println(c3)

    val (xCoordinate, yCoordinate) = c3
    //println("x: $xCoordinate, y: $yCoordinate")
    println("x: ${c3.component1()}, y: $yCoordinate")

    showComponents()

}

fun showComponents() {
    val myPoint = Point(5000, 500, 60000)
    val (myX, myY, myZ) = myPoint
    println("x = $myX, y = $myY, z = $myZ")
}