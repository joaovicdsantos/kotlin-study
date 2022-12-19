package br.com.joaovicdsantos.section05._0505

fun main() {

    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(123_456_789L, 990_123_123L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Alpha", "Omega")

    println("The max int = $maxInt")
    println("The max long = $maxLong")
    println("The max byte = $maxByte")
    println("The max string = $maxString")

}