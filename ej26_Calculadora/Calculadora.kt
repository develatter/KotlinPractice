package ej26_Calculadora

/**
 * Diseñar un algoritmo que lea dos números, A y B, y un operador (mediante una variable de tipo carácter), y
 * calcule el resultado de operar A y B con esa operación. Por ejemplo, si A = 5 y B = 2, y operación = "+", el
 * resultado debe ser 7. El algoritmo debe seguir pidiendo números y operaciones indefinidamente, hasta que el
 * usuario decida terminar (utiliza un valor centinela para ello)
 */
fun main() {

    val calculator = Calculator()

    var running = true

    while (running) {
        calculator.singleOperation()
        println("¿Desea realizar otra operación? " +
                "\n(s para continuar, cualquier otra cosa para detener el programa)")
        running = askConfirmation() == 's'
    }
}

fun askConfirmation() : Char = sequence {
    while (true) {
        val c = readln().trim()
        yield(
            if (c.length == 1 && c[0].lowercaseChar() == 's') 's'
            else 'n'
        )
    }
}.first()

class Calculator() {
    var op1 = Double.NaN
    var op2 = Double.NaN
    var operator = 'n'
    private fun addition(a: Double, b: Double): Double = a + b
    private fun substraction(a: Double, b: Double): Double = a - b
    private fun multiplication(a: Double, b: Double): Double = a * b
    private fun division(a: Double, b: Double): Double = a / b

    fun calculate(a: Double, b: Double, op: Char) =
        when (op) {
            '+' -> addition(a, b)
            '-' -> substraction(a, b)
            '*' -> multiplication(a, b)
            else -> division(a, b)
        }

    private fun askNumber(): Double = sequence {
        while (true) {
            val n = readln().toDoubleOrNull()
            if (n == null) println("Introduce un número válido")
            yield(n)
        }
    }.filterNotNull().first()


    private fun askOperation(): Char = sequence {
        val allowed = listOf('+', '-', '*', '/')
        while (true) {
            val c = readln().trim()
            if (c.length == 1 && c[0] in allowed) yield(c[0])
            else println("Introduce una operación válida")
        }
    }.first()


    fun singleOperation() {
        println("Introduce el primer número: ")
        op1 = askNumber()
        println("Introduce el operador (+, -, *, /): ")
        operator = askOperation()
        println("Introduce el segundo número: ")
        op2 = askNumber()

        println("¿Desea realizar la operación $op1 $operator $op2 ? " +
                "\n(s para confirmar, cualquier otra cosa para cancelar)")

        val response = askConfirmation()
        println(
            if (response == 's') "$op1 $operator $op2 = ${calculate( op1, op2, operator)}"
            else  "Cancelando la operación..."
        )
    }
}

