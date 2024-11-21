package temperatura

fun main() {

    var option : Int? = null
    while (option == null) {
        printMenu()
        option = readOption()
    }


    println("Introduce un número: ")
    var n = readNumber()
    while (n == null) {
        println("Introduce un número válido: ")
        n = readNumber()
    }

    print("$n")
    println(when(option) {
        1 ->"ºC en ºF es ${Temperature.celsiusToFarenheit(n)}ºF"
        else -> "ºF en ºC es ${Temperature.farenheitToCelsius(n)}ºC"
    })

}

fun printMenu() {
    print(
        """
            Elige una opción:
                1. Celsius a Farenheit
                2. Farenheit a Celsius
                -> 
        """.trimIndent()
    )
}

fun readNumber() = readln().toDoubleOrNull()
fun readOption() = readln().toIntOrNull()?.takeIf { it in 1..2 }