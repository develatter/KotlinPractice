package ej15_Acumulador_Interactivo

/**
 * Calcular el valor medio de una serie de valores enteros positivos introducidos por teclado.
 * Para terminar de introducir valores, el usuario debe teclear un número negativo.
 */

fun main() {
    val media = acumular()

    println(media?.let{
        "La media de todos los números es $it"
    }?:"No se han introducido números")
}

fun readNumber() : Int? = readln().toIntOrNull()

fun acumular() : Double? {
    var sum = 0
    var num = 0
    var counter = 0
    do {
        println("Introduce un número: ")
        num = readNumber() ?: continue
        if (num >= 0)  {
            sum += num
            counter++
        }
    } while (num >= 0)
    return if (counter > 0) sum.toDouble() / counter else null
}

/**
 * Forma declarativa
 */
fun calcularMedia(): Double? {
    val numeros = generateSequence {
        var num: Int?
        do {
            println("Introduce un número: ")
            num = readNumber()
        } while (num == null)
        num.takeIf { it >= 0 }
    }.toList()
    return if (numeros.isNotEmpty()) numeros.average() else null
}