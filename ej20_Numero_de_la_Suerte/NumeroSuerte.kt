package ej20_Numero_de_la_Suerte

import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * El número de la suerte o lucky number, por si hay alguien de Cuenca, es una tontuna de los numerólogos y
 * otros charlatanes que se obtiene sumando todas las cifras de la fecha de nacimiento de un modo azaroso.
 * Por ejemplo, como yo nací el 15 de octubre de 1974 (15-10-1974), se supone que mi número de la suerte es
 * 15+10+1974 = 1999. Ahora sumo todas las cifras de 1999 así: 1+9+9+9 = 28. Como aún tengo dos dígitos,
 * vuelvo a sumarlos. 2 + 8 = 10 => 1 + 0 = 1.
 * Por lo tanto, 1 es mi número de la suerte. Si alguna vez me toca la lotería y llevo un número acabado en 1, os aviso.
 * Escribe un programa que, dada una fecha de nacimiento, calcule el número de la suerte de esa persona
 */

fun main() {
    println("Introduce tu fecha de nacimiento")
    val date = readln()
    println(
        if (!isValidDate(date)) "La fecha no es válida"
        else "tu número de la suerte es ${luckyNumber(date)}"
    )
}

fun luckyNumber(date: String): Int {
    val (day, month, year) = date.split("-")
    val sum = day.toInt() + month.toInt() + year.toInt()
    return reduceNumber(sum)
}

fun reduceNumber(number: Int): Int {
    var res = number
    while (res >= 10) {
        res = res.toString().map {
            it.digitToInt()
        }.reduce { a, b -> a + b }
    }
    return res
}

fun isValidDate(date: String): Boolean = runCatching {
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    LocalDate.parse(date, formatter)
    true
}.getOrNull() ?: false