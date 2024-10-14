package ej25_Quiniela

/**
 * Generar combinaciones al azar para la quiniela (14 valores dentro del conjunto 1, X o 2.
 * El resultado debe ser algo así, pero generado al azar:
 *                          1-X-X-2-1-1-1-2-2-X-1-X-X-2
 */

fun main() {
    genQuiniela()

    println(genQuinielaAdv().joinToString("-"))
}

fun genQuiniela() {
    val options = listOf('1', 'X', '2')
    val charList = mutableListOf<Char>()
    for (i in 0..<14) {
        charList.add(options[(Math.random() * 3).toInt()])
    }
    println(charList.joinToString("-"))
}

//Otra forma de hacerlo
fun genQuinielaAdv(): List<Char> = List(14) {
    listOf('1', '2', 'X').random()
}