package com.dam1.unidad3
import kotlin.math.sqrt

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

    var media: Double = 0.0
    print("Dame una lista de números separados por comas: ")
    val entrada = readLine()?.split(",") ?: emptyList()
    val numeros = entrada.mapNotNull { it.toIntOrNull() }

    if (numeros.isEmpty()) {
        println("Lista vacía o inválida.")
        return
    }


    media = numeros.sum().toDouble() / numeros.size


    val desviacion = sqrt(numeros.map { (it - media) * (it - media) }.sum() / numeros.size)

    println("Media: $media")
    println("Desviación estándar: $desviacion")
}
