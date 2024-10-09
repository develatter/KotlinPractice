package ej18_Factorial

import java.math.BigInteger

/**
 * Calcular el factorial de un número entero N. Recuerda que el factorial de un número es el producto de
 * ese número por todos los enteros menores que él. Por ejemplo, el factorial de 5 (simbolizado 5!) se
 * calcula como: 5! = 5 x 4 x 3 x 2 x 1.
 * Cuando funcione, prueba a calcular el factorial de un número muy grande, como 288399849! o algo parecido,
 * y verás qué risa.
 */

fun main() {
    val n: Long = 20
    println("El factorial de $n es ${factorial(BigInteger.valueOf(n))}")
}

fun factorial(n: BigInteger): BigInteger =
    if (n == BigInteger.ZERO) BigInteger.ONE
    else n.multiply(
        factorial(
            n.subtract(BigInteger.ONE)
        )
    )
