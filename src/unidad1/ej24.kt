package com.dam1.unidad1
fun main() {
    print("Introduce el precio del producto en euros (con dos decimales): ")
    val precioStr = readLine() ?: ""

    try {
        val precio = precioStr.toDouble()

        if (precio < 0) {
            println("El precio no puede ser negativo.")
        } else {
            val euros = precio.toInt() // Parte entera del precio
            val centimos = ((precio - euros) * 100).roundToInt() // Parte decimal convertida a céntimos
            println("Número de euros: $euros")
            println("Número de céntimos: $centimos")
        }
    } catch (e: NumberFormatException) {
        println("Por favor, introduce un número válido.")
    }
}
