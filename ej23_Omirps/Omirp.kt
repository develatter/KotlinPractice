package ej23_Omirps

/**
 * Un omirp es una de esas cosas que nos hace dudar sobre la estabilidad mental de los matemáticos. Se trata de
 * un número primo que, al invertirlo, también da como resultado un número primo. Por ejemplo, el número 7951 es
 * primo y, si le damos la vuelta, obtenemos 1597, que también es primo. Por lo tanto, 7951 es un omirp.
 * Se trataría, pues, de introducir un número y que el programa determine si es un omirp o no. O más difícil
 * todavía (redoble de tambores): hacer un programa que muestre la lista de omirps entre 0 y N, siendo N un número
 * introducido por el usuario.
 */

fun main() {
    println("Introduce un número: ")
    val n = readln().toIntOrNull()

    println(
        n?.let {
            "El número $n ${if (isOmirp(n)) "" else "NO "}es un omirp"
        } ?: "Introduce un número válido."
    )
}

fun isOmirp(n: Int): Boolean = isPrime(n)
        && isPrime(
    n.toString()
        .reversed()
        .toInt()
)

fun isPrime(n: Int): Boolean = n >= 2 && (2..<n).none {
    n % it == 0
}

