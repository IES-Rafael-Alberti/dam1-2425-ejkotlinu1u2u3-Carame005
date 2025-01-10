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

    val asignaturas = mapOf(
        "Matemáticas" to 6,
        "Física" to 4,
        "Química" to 5
    )

    for ((asignatura, creditos) in asignaturas) {
        println("$asignatura tiene $creditos créditos")
    }
}
