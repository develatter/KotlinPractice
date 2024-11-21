package carrito_de_la_compra
/**
 * Crear un enum que contendrá varios productos. Las constantes tendrán un nombre de producto (String), un precio (Double) y
 * un descuento (Double?).
 * Crear una clase Carrito con una lista donde añadir los productos que vaya indicando el usuario.
 * Esta clase también tendrá la posibilidad de realizar la compra. Mostrará por pantalla la lista de productos y el total
 * de la compra.

 * El carrito deberá tener métodos para añadir productos, bien de uno en uno, bien varios de una vez.
 * Además, tendrá métodos para borrar los productos del carrito.
 *
 * Por último un Main donde ejecutar la compra para esta clase.
 *
 */
fun main() {
    val carrito = Carrito()
    carrito.add(Productos.CAFE, 3)
    carrito.add(Productos.AZUCAR, 2)
    carrito.add(Productos.CACAO, 5)
    carrito.add(Productos.LECHE, 2)
    carrito.add(Productos.LECHE)
    carrito.remove(Productos.CACAO, 2)
    carrito.add(Productos.ZUMO)
    carrito.show()
}