package com.dam1.unidad3
import java.util.*

fun limpiarPantalla() {
    try {
        val os = System.getProperty("os.name").toLowerCase()
        if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            Runtime.getRuntime().exec("clear")
        } else {
            Runtime.getRuntime().exec("cls")
        }
    } catch (e: Exception) {
        println("Error al intentar limpiar la pantalla")
    }
}

fun main() {
    limpiarPantalla()

    val frutas = mapOf(
        "Platano" to 1.35,
        "Manzana" to 0.80,
        "Pera" to 0.85,
        "Naranja" to 0.70
    )

    print("Dame una fruta: ")
    val fruta = readLine()?.capitalize(Locale.getDefault()) ?: ""

    print("¿Cuántos kilos quiere?: ")
    val kilos = readLine()?.toDoubleOrNull()

    if (fruta in frutas) {
        if (kilos != null) {
            val precio = frutas[fruta]!! * kilos
            println("El precio total es: $precio")
        } else {
            println("Entrada inválida para los kilos.")
        }
    } else {
        println("Su fruta no se encuentra aquí.")
    }
}
