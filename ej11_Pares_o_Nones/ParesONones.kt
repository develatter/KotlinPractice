package ej11_Pares_o_Nones

/**
 * Escribe un programa que pregunte al usuario si desea ver los números pares o impares y que,
 * dependiendo de la respuesta, muestre en la pantalla los números pares o impares entre A y B.
 * Cualquiera de ellos puede ser el mayor
 */
fun main() {
    println("Introduzca el primer número: ")
    val num1 = readInt()

    println("Introduzca el segundo número: ")
    val num2 = readInt()

    println(
        num1?.let { a ->
            num2?.let { b ->
                println(
                    """
                        ¿Desea ver números pares o impares?
                        1. Pares
                        2. Impares
                        3. Salir
                        """.trimIndent()
                )
                val ans = readln()
                val (menor, mayor) = order(a, b)
                when (ans) {
                    "1" -> listPares(menor, mayor).joinToString()
                    "2" -> listImpares(menor, mayor).joinToString()
                    else -> "¡Adiós!"
                }
            }
        } ?: "Es necesario introducir dos números"
    )
}

fun listPares(menor: Int, mayor: Int): List<Int> = ((menor + 1)..<mayor).filter { i -> i % 2 == 0 }
fun listImpares(menor: Int, mayor: Int): List<Int> = ((menor + 1)..<mayor).filter { i -> i % 2 != 0 }
fun order(a: Int, b: Int): Pair<Int, Int> = if (a < b) a to b else b to a
fun readInt(): Int? = readln().toIntOrNull()