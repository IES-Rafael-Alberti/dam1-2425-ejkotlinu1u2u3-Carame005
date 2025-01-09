package com.dam1.unidad1
fun main() {
    print("Introduce los productos de la cesta de la compra, separados por comas: ")
    val productosStr = readLine() ?: ""

    val productos = productosStr.split(",").map { it.trim() }

    println("\nLos productos en tu cesta de la compra son:")
    for (producto in productos) {
        println(producto)
    }
}
