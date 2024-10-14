package ej24_Loteria_primitiva

/**
 * Generar combinaciones al azar para la lotería primitiva (6 números entre 1 y 49). Debes utilizar el método
 * Math.random(). Por ahora, no te preocupes porque los números puedan repetirse.
 */

fun main() {
    println("Tu número es:\n${getPrimitive().joinToString(" - ")}")
    println("El número pero sin repetir:\n${getPrimitiveNoRepeat().joinToString(" - " )}")
}

fun getRandom(): Int = (Math.random() * 49).toInt() + 1

fun getPrimitive(): List<Int> = sequence {
    while (true) {
        yield(getRandom())
    }
}.take(6).toList()


// Para que no se repitan se puede usar un set

fun getPrimitiveNoRepeat(): Set<Int> {
    val primitive = mutableSetOf<Int>()
    while (primitive.size < 6) {
        primitive.add(getRandom())
    }
    return primitive
}