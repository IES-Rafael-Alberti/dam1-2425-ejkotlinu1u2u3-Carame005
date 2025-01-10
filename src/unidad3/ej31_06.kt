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

fun main() {
    limpiarPantalla()

    val asignaturas = listOf("PROG", "BD", "EDES", "LMDSI", "SSI", "IPE", "DIG")
    val recuperar = mutableListOf<String>()

    for (asignatura in asignaturas) {
        print("Dime la nota de $asignatura: ")
        val nota = readLine()?.toIntOrNull() ?: continue
        if (nota < 5) {
            recuperar.add(asignatura)
        }
    }

    println("Tienes que recuperar las siguientes asignaturas: $recuperar")
}
