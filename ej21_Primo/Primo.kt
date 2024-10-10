package ej21_Primo

fun main() {
    println("Escribe un número")
    val n = askNumber()
    println(
        "El número $n ${if (!esPrimo2(n)) "NO " else ""}es primo."
    )
}

//Una buena forma de pedir de forma indefinida un número hasta que sea correcto
fun askNumber(): Int = sequence {
    while (true) {
        val n = readln().toIntOrNull()

        if (n != null) yield(n)
        else println("Introduce un número válido:")
    }
}.take(1).first()

//Forma más convencional
fun esPrimo(n: Int): Boolean {
    val range = 2..<n
    var primo = n >= 2

    for (i in range) {
        if (n % i == 0) primo = false
    }
    return primo
}

//Forma más declarativa
fun esPrimo2(n: Int): Boolean = n >= 2 &&
        (2..<n).none { n % it == 0 }