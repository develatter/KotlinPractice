package ej09_Pares

/**
 * Ahora sí empiezan los bucles. Escribe un programa que muestre todos los números pares entre A y B,
 * siendo estos dos valores dos números introducidos por teclado. A debe ser menor que B, claro. En caso contrario,
 * el programa debe avisarnos, pero con cariño.
 */

fun main() {
    println("Introduce un número: ")
    val first = readInt()
    println("Introduce otro número: ")
    val second = readInt()

    println(
        first?.let { a ->
            second?.let { b ->
                if (a < b) getPares(a, b).joinToString() else "A debe ser menor que B"
            }
        } ?: "Número no válido"
    )
}

fun getPares(a: Int, b: Int): List<Int> = (a..<b).filter { it % 2 == 0 }
fun readInt(): Int? = readln().toIntOrNull()

