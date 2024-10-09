package ej14_Acumulador_Simple

/**
 * Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998 + 1000.
 */

fun main() {
    println("La suma de todos los pares entre el 1 y el 1000 es ${listEven1To1000().reduce{a, b -> a + b}}")
}

fun listEven1To1000() : List<Int> = (1..1000).filter { it % 2 == 0 }
