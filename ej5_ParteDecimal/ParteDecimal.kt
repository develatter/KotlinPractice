package ej5_ParteDecimal

import kotlin.math.round

/**
 * Averiguar si un número real introducido por teclado tiene o no parte fraccionaria
 * (utilícese el método Math.round() que aparece descrito en el tema 1, o si no, búscalo en Internet)
 */
fun main() {
    println("Introduce un número para saber si tiene parte fraccionaria: ")
    val number = readln().toDoubleOrNull()

    println(number?.let {
        if (esFraccionario(it)) "El número $it es fraccionario"
        else "$it no tiene parte fraccionaria"
    } ?: "No se ha introducido un número válido")
}

fun esFraccionario(num: Double): Boolean = num != round(num)