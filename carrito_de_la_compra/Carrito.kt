package carrito_de_la_compra

import java.util.*
import kotlin.math.round

class Carrito {
    private val listaProductos: MutableMap<Productos, Int> = mutableMapOf()


    fun add(p : Productos, n : Int) {
        if (p in listaProductos.keys) {
            listaProductos[p] = listaProductos[p]!! + 1
        } else {
            listaProductos[p] = n
        }
    }

    fun add(p: Productos) {
        add(p, 1)
    }

    fun removeOne(p: Productos) {
        remove(p, 1)
    }

    fun remove(p: Productos, cant : Int) {
        if (p !in listaProductos.keys) return
        if (listaProductos[p]!! > cant ) {
            listaProductos[p] = listaProductos[p]!! - cant
        } else {
            listaProductos.remove(p)
        }
    }

    fun removeAll(p: Productos) {
        if (p !in listaProductos.keys) return
        listaProductos.remove(p)
    }

    fun removeAll()  = listaProductos.clear()

    private fun calculatePrice(p: Productos, n: Int) : Double = round(
        p.precio * n * (1 - (p.descuento ?: 0.0) / 100) * 100
    )/ 100


    fun show() {
        var total = 0.0
        println(String.format(
            "%-10s | %10s | %10s | %10s | %10s |",
            "Producto",
            "€/U",
            "Cant.",
            "Dsc.",
            "Precio"
        ))
        printHorizontalLine()
        total = printProduct(listaProductos)
        printHorizontalLine()
        println(
            String.format(
                Locale("en", "EN"),
                "%49s | %10.2f€|", "Total", total)
        )
        printHorizontalLine()
    }

    private fun printProduct(lista : Map<Productos, Int>) : Double {
        var total = 0.0
        lista.forEach { (product, amount) ->
            val price = calculatePrice(product, amount)
            println(
                String.format(
                    Locale("en", "EN"),
                    "%-10s | %10.2f | %10d | %10.2f | %10.2f |",
                    product.nombre,
                    product.precio,
                    amount,
                    product.descuento ?: 0.0,
                    price
                )
            )
            total += price
        }
        return total
    }

    private fun printHorizontalLine() {
        print("-".repeat(63))
        println("+")
    }
}