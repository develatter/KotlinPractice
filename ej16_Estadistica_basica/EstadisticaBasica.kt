package ej16_Estadistica_basica

import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Calcular el valor máximo de una serie de 10 números introducidos por teclado.
 * Completa luego la clase para que también averigüe el valor mínimo, el medio, la desviación típica y la mediana.
 */
fun main() {
    val numList = askTenNumbers()
    println("La lista: ${numList.joinToString()}")
    println("El valor máximo de la lista es ${numList.max()}")
    println("El valor mínimo de la lista es ${numList.min()}")
    println("El valor medio de la lista es ${numList.average()}")
    println("La desviación típica es ${desviacionTipica(numList)}")
    println("La mediana es ${medianaPar(numList)}")


}

fun askTenNumbers(): List<Int> = sequence {
    while (true) {
        println("Introduce un número")
        yield(readln().toIntOrNull())
    }
}.filterNotNull().take(10).toList()


fun desviacionTipica(list: List<Int>): Double = sqrt(
    list.map { i ->
        (i - list.average()).pow(2)
    }.reduce { a, b -> a + b } / list.size
)

fun medianaPar(list: List<Int>): Double {
    val sortedList = list.sorted()
    val size = sortedList.size
    return (sortedList[size / 2 - 1] + sortedList[size / 2]) / 2.0
}