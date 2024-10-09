package ej3_Restar

/**
 * Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la resta del mayor menos el menor.
 * Por ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5.
 * Pero si A = 4 y B = 7, el resultado debe ser B – A, es decir, 3.
 */
fun main() {
    println("Introduce un número: ")
    val numeroA = getNumber()
    println("Introduce un segundo número: ")
    val numeroB = getNumber()

    println(numeroA?.let { a ->
        numeroB?.let { b ->
            "$a - $b = ${substract(numeroA, numeroB)}"
        }
    } ?: "Se han introducido parámetros no válidos"
    )
}

fun substract(a: Double, b: Double): Double = a - b

fun getNumber(): Double? = readln().toDoubleOrNull()