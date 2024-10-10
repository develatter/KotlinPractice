package ej22_Erastotenes

/**
 * Generalizar el algoritmo anterior para averiguar todos los números primos que existen entre 2 y 1000
 * (a este proceso se le conoce como criba de Eratóstenes, que no es que tenga mayor importancia, pero sirve
 * para ponerle un título interesante a este ejercicio)
 */

fun main() {
    println("Los números primos entre 2 y 1000 son:")
    println(first1000PrimeNumbers().joinToString(" - "))
}

fun esPrimo(n : Int) : Boolean = n >= 2 &&
        (2..<n).none{ n % it == 0}

fun first1000PrimeNumbers() : List<Int> = (2..1000).filter{esPrimo(it)}