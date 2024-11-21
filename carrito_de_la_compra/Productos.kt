package carrito_de_la_compra

enum class Productos(
    val nombre: String,
    val precio: Double,
    val descuento: Double?
) {
    CAFE("Café", 1.9, 5.0),
    ZUMO("Zumo", 2.9, null),
    CACAO("Cacao", 3.5, null),
    AZUCAR("Azúcar", 2.0, 10.0),
    LECHE("Leche", 2.1, 2.5);
}