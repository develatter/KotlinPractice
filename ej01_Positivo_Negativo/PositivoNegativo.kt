package ej01_Positivo_Negativo

/**
 * Leer un número por teclado mediante un método, y decir si es positivo o negativo con otro método.
 * La salida por consola puede ser algo así como: "el número X es positivo"
 */
fun main() {
    println("Introduce un número: ")
    val number = readln().toIntOrNull()
    println(
        number?.let {
            if (esPositivo(it)) "El número $number es positivo"
            else "El número $number NO es positivo"
        } ?: "El número no es válido"
    )
}
fun esPositivo(num: Int): Boolean = num > 0


