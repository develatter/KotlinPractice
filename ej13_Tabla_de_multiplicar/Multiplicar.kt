package ej13_Tabla_de_multiplicar

/**
 * El usuario teclea un número y el programa muestra la tabla de multiplicar de este.
 */

fun main() {
    println("Introduce un número: ")
    val num = readln().toIntOrNull()
    num?.let {
        printTablas(it)
    } ?: println("El número no es válido")
}


fun printTablas(num: Int): Unit = (1..10).forEach { i -> println("$num x $i = ${num * i}") }