package br.com.joaovicdsantos.section07._0705

data class Coordinates(var x: Int, var y: Int) {

    operator fun plus(other: Coordinates): Coordinates {
        return Coordinates(x + other.x, y + other.y)
    }

    operator fun minus (other: Coordinates) : Coordinates {
        return Coordinates(x - other.x, y - other.y)
    }

}
