package ej17_Notas_de_clase

/**
 * El usuario de este programa será un profesor, que introducirá las notas de sus 30 alumnos de una en una.
 * El algoritmo debe decirle cuántos suspensos y cuántos aprobados hay.
 * Las notas pueden valer entre 1 y 10, y el programa no debe aceptar valores fuera de ese rango.
 */
fun main() {
    getStats(getNotas())
}

fun getNotas(): List<Int> = sequence {
    while(true) {
        println("Introduce una nota")
        yield(askNota())
    }
}.take(30).toList()


fun askNota(): Int {
    var nota = readln().toIntOrNull()

    while (nota == null || nota < 1 || nota > 10) {
        println("Introduce una nota válida")
        nota = readln().toIntOrNull()
    }
    return nota
}

fun getStats(num : List<Int>): Unit = println(
    "La clase tiene ${num.filter{i -> i >= 5}.size} aprobados y ${num.filter{i -> i < 5}.size} suspensos"
)




