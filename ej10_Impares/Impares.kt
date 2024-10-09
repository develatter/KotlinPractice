package ej10_Impares

/**
 * Escribir todos los números impares entre dos números A y B introducidos por teclado.
 * En esta ocasión, cualquier de ellos puede ser el mayor.
 * Habrá que comprobar, entonces, cuál de los dos números, A o B es mayor,
 * para empezar a escribir los impares desde uno o desde otro.
 */

fun main() {
    println("Introduce el primer número")
    val first = getNumber()
    println("Introduce el segundo número")
    val second = getNumber()

    println(
        first?.let { a ->
            second?.let { b ->
                val (menor, mayor) = if (a < b) a to b else b to a
                val list = getOddNumbers(menor, mayor)
                if (list.isEmpty()) "No se han encontrado números" else (list.joinToString())
            }
        } ?: "Debes introducir dos números"
    )
}

fun getOddNumbers(menor: Int, mayor: Int): List<Int> = (menor + 1..<mayor).filter { it % 2 != 0 }
fun getNumber(): Int? = readln().toIntOrNull()