package ej2_Raiz_Cuadrada
import kotlin.math.sqrt
/**
 * Calcular la raíz cuadrada de un número introducido por teclado.
 * Hay que tener la precaución de comprobar que el número sea positivo.
 */
fun main() {
    println("Introduce un número: ")
    val num = readln().toDoubleOrNull()

    println(
        num?.let {
            "La raíz cuadrada de $it es ${squareRoot(it)}"
        } ?: "No se ha registrado un número válido")
}


fun squareRoot(num: Double): Double = sqrt(num)


