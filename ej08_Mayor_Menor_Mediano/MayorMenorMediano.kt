package ej08_Mayor_Menor_Mediano

/**
 * Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál el mediano.
 * Y da gracias a que no lo hemos hecho con 4 variables. Prohibido usar arrays, suponiendo que sepas lo que son.
 * Es un ejercicio de lógica, no de bucles.
 */

fun main() {
    runCatching {
        askNumber()
        val a = readln().toInt()
        askNumber()
        val b = readln().toInt()
        askNumber()
        val c = readln().toInt()

        val menor = when {
            b in a..c -> a
            b <= a && b <= c -> b
            else -> c
        }

        val mediano = when {
            (a in b..c) ||  (a in c..b) -> a
            (b in a..c) || (b in c..a) -> b
            else -> c
        }

        val mayor = when {
            a >= b && a >= c -> a
            b >= a && b >= c -> b
            else -> c
        }
        println("Números en el orden introducido: $a - $b - $c")
        println("Números ordenados $menor <= $mediano <= $mayor")
    }.onFailure {
        println("El número no es válido")
    }
}

fun askNumber() = println("Introduce un número: ")


