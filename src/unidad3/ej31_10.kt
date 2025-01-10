package com.dam1.unidad3
import java.io.IOException

val PRECIOS = mutableListOf(50, 75, 46, 22, 80, 65, 8)

fun limpiarPantalla() {
    try {
        val os = System.getProperty("os.name").toLowerCase()
        if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            Runtime.getRuntime().exec("clear")
        } else {
            Runtime.getRuntime().exec("cls")
        }
    } catch (e: IOException) {
        println("Error al intentar limpiar la pantalla")
    }
}

fun main() {
    limpiarPantalla()
    PRECIOS.sort()
    println("El menor es: ${PRECIOS.first()} y el mayor: ${PRECIOS.last()}")
}
