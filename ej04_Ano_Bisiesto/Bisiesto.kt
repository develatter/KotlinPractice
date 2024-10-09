package ej04_Ano_Bisiesto

/**
 * Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4; utilícese el operador módulo.
 * ¡Pero hay más excepciones! Los múltiplos de 100 no son bisiestos, aunque sean múltiplos de 4.
 * Pero los múltiplos de 400 sí, aunque sean múltiplos de 100. Qué follón.
 * Resumiendo: un año es bisiesto si es divisible entre 4, a menos que sea divisible entre 100.
 * Sin embargo, si un año es divisible entre 100 y además es divisible entre 400, también resulta bisiesto.
 */
fun main() {
    println("Introduce un año: ")
    val year = readln().toIntOrNull()

    println(year?.let {
        if (leapYear(year)) "$it es un año bisiesto"
        else "$it no es un año bisiesto"
    } ?: "No se ha introducido un año válido")

}

fun by4(num: Int): Boolean = num % 4 == 0
fun by100(num: Int): Boolean = num % 100 == 0
fun by400(num: Int): Boolean = num % 400 == 0
fun leapYear(num: Int): Boolean = by4(num) && (!by100(num) || by400(num))
