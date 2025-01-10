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

    val info = mutableMapOf<String, String>()

    print("Dame tu nombre: ")
    info["Nombre"] = readLine().orEmpty()
    println(info)

    print("Dame tu edad: ")
    info["Edad"] = readLine().orEmpty()
    println(info)

    print("Dame tu dirección: ")
    info["Dirección"] = readLine().orEmpty()
    println(info)

    print("Dame tu teléfono: ")
    info["Teléfono"] = readLine().orEmpty()
    println(info)
}
