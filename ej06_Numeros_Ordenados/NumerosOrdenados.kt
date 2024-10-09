package ej06_Numeros_Ordenados

/**
 * Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.
 * Complétalo con otro método que nos diga si los números, además de estar ordenados, son consecutivos.
 */
fun main() {
    val listNumeros: MutableList<Double> = mutableListOf()

    repeat(3) { i ->
        println("Introduce el número ${'A' + i}")
        listNumeros.add(readDouble() ?: return println("Número no válido"))
    }

    println(
        if (isSorted(listNumeros)) "Los números están ordenados de menor a mayor"
        else "Los números no están ordenados"
    )

    println(
        if (isConsecutive(listNumeros)) "y además son consecutivos"
        else ""
    )
}

fun readDouble(): Double? = readln().toDoubleOrNull()
fun isSorted(list: MutableList<Double>): Boolean = list == list.sorted()
fun isConsecutive(list: MutableList<Double>): Boolean {
    for (i in 0..<(list.size - 1)) {
        if (list[i] + 1 != (list[i + 1])) return false
    }
    return true
}