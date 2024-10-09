package ej12_Dibujando_con_asteriscos

/**
 * Escribe una clase capaz de generar en la pantalla, mediante bucles, unos bonitos diseños.
 */

fun main() {
    isosceles(5)
    rombo(5)
    romboHueco(5)
    arbol()
}


fun isosceles(niveles: Int) {
    (1..niveles).forEach { i ->
        val spaces = " ".repeat(niveles - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
}


fun isosceles(niveles: Int, indent: Int) {
    (1..niveles).forEach { i ->
        val spaces = " ".repeat(niveles - i + indent)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
}

fun rombo(niveles: Int) {
    (1..niveles).forEach { i ->
        val spaces = " ".repeat(niveles - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
    ((niveles - 1).downTo(1)).forEach { i ->
        val spaces = " ".repeat(niveles - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
}

fun romboHueco(niveles: Int) {
    (1..niveles).forEach { i ->
        val outerSpaces = " ".repeat(niveles - i)
        val innerSpaces = if (i == 1) "" else " ".repeat(2 * i - 3)
        val stars = if (i == 1) "*" else "*$innerSpaces*"
        println(outerSpaces + stars)
    }
    ((niveles - 1).downTo(1)).forEach { i ->
        val outerSpace = " ".repeat(niveles - i)
        val innerSpace = if (i == 1) "" else " ".repeat(2 * i - 3)
        val stars = if (i == 1) "*" else "*$innerSpace*"
        println(outerSpace + stars)
    }
}
fun arbol() {
    isosceles(2, 5)
    isosceles(4, 3)
    isosceles(7)
    repeat(4){ println("     ***")}
}