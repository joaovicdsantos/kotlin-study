package br.com.joaovicdsantos.section08._0810

import org.funktionale.memoization.memoize

fun main() {

    var fibonacci: (Long) -> Long = { it }

    fibonacci = { n: Long ->
        if (n < 2) n else fibonacci(n - 1) + fibonacci(n - 2)
    }

    var memo: (Long) -> Long = { it }

    memo = { n: Long ->
        if (n < 2) n else memo(n - 1) + memo(n - 2)
    }.memoize()

    println("Calling fibonacci: ${timeElapsed { fibonacci(40) } } ms")
    println("Calling memoized fibonacci: ${timeElapsed { memo(40) } } ms")

}

fun timeElapsed(body: () -> Unit): Long {
    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end - start
}