package com.dam1.unidad3
import java.io.IOException

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

fun esPalindromo(palabra: String) {
    val letraInvertida = palabra.reversed()
    if (letraInvertida == palabra) {
        println("Es un palíndromo")
    } else {
        println("No es un palíndromo")
    }
}

fun main() {
    limpiarPantalla()
    print("Dame una palabra: ")
    val palabra = readLine() ?: ""
    esPalindromo(palabra)
}
