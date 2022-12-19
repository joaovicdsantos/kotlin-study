package br.com.joaovicdsantos.section04.challenge


fun fizzBuzz(n: Int): List<String> {
    val fizzBuzzList: ArrayList<String> = arrayListOf()
    for (i in 1..n) {
        val item = when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }
        fizzBuzzList.add(item)
    }
    return fizzBuzzList
}
