package finanzas

/**
 * Hacer un programa que, dado un tipo de cambio, permita pasar de dólares a euros y viceversa.
 */
fun main() {
    Conversor().run()
}

class Conversor() {

    fun run() {
        var option : Int? = null
        println("Introduzca un tipo de cambio (opcional): -> ")
        val tipo = readNumber()

        val finanzas = tipo?.let {
            Finanzas(it)
        } ?: Finanzas()

        while(option == null) {
            printMenu()
            option = readOption()
        }

        println("Introduce un valor: ")
        print("--> ")

        var n = readNumber()
        while(n == null) {
            println("Introduce un valor válido: ")
            n = readNumber()
        }

        println(
            when(option) {
                1 -> {
                    "$n$ en Euros es ${finanzas.dolaresToEuros(n)}$"
                }
                else -> {
                    "$n€ en Dólares es ${finanzas.eurosToDolares(n)}€"
                }
            }
        )
    }

    private fun printMenu() {
        print(
            """
            Elige una opción:
                1. Dólares a Euros
                2. Euros a Dólares 
                -> 
        """.trimIndent()
        )
    }

    private fun readNumber() = readln().toDoubleOrNull()
    private fun readOption() = readln().toIntOrNull()?.takeIf { it in 1..2 }
}

