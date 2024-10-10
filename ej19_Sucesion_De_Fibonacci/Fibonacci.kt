package ej19_Sucesion_De_Fibonacci

import java.math.BigInteger

/**
 * La famosa sucesión de Fibonacci es una sucesión no convergente de números enteros que comienza así:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * Cada número de la sucesión se calcula sumando los dos números anteriores
 * (excepto los dos primeros, que son, por definición, 0 y 1).
 * Se da la curiosa circunstancia de que los números de la sucesión de Fibonacci aparecen con sorprendente precisión
 * en muchas estructuras naturales, como los ángulos de crecimiento de las ramas de árboles cuando son iluminados
 * verticalmente, la disposición de los pétalos de los girasoles o de las piñas en los pinos, la forma de las cochas
 * de los caracoles, y cosas así. Si lo piensas, es un poco inquietante que un producto de la imaginación humana
 * como son las matemáticas tenga una relación tan estrecha con la naturaleza.
 * ¿O era al revés? Bueno, al diablo.
 * A lo que íbamos: escribe un programa que muestre en la pantalla los N primeros términos de la sucesión de Fibonacci,
 * siendo N un número entero introducido por el usuario.
 */
fun main() {

    println("Introduce un número: ")
    val n = readln().toIntOrNull()

    println(
        n?.let {
            fibonacciSequence(it).joinToString()
        } ?: "Debes introducir un número válido"
    )

}


fun fibonacci(number : Int): List<BigInteger>{
    val fibonacci = mutableListOf(BigInteger.ZERO, BigInteger.ONE)
    for (i in 1..< number - 1) {
        fibonacci.add(fibonacci[i].add(fibonacci[i - 1]))
    }
    return fibonacci
}

// Es una excusa perfecta para practicar secuencias
fun fibonacciSequence(number: Int): Sequence<BigInteger> = sequence<BigInteger> {
    var before = BigInteger.ZERO
    var current = BigInteger.ONE
    while (true) {
        yield(before)
        current = before.also { before += current } //also devuelve el valor del propio objeto antes de las llaves
    }
}.take(number)
