package ej7_Contar_Cifras
import kotlin.math.abs
/**
 * Determinar el número de cifras de un número entero.
 * El algoritmo debe funcionar para números de hasta 5 cifras, considerando los negativos.
 * Por ejemplo, si se introduce el número 5342, la respuesta del programa debe ser 4.
 * Si se introduce –250, la respuesta debe ser 3.
 */
fun main() {
    println("Introduce un número: ")
    val n = readln().toIntOrNull()
    println(n?.let {
        "El número $n tiene ${countDigits(n)} dígitos"
    } ?: "No has introducido un número válido")
}

//Más rápido
fun countDigits(num: Int) : Int {
    var count = 0
    var n = abs(num)
    while (n > 0) {
        n /= 10
        count++
    }
    return count
}

//Más legible
fun countDigits2(num: Int) : Int = abs(num).toString().length