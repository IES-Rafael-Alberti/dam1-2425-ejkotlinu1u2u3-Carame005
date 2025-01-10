package com.dam1.unidad3
import java.util.*

fun limpiarPantalla() {
    val os = System.getProperty("os.name")
    if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
        Runtime.getRuntime().exec("clear")
    } else {
        Runtime.getRuntime().exec("cls")
    }
}

fun mostrarNombres(msj: String): List<String> {
    println(msj)
    val alumnos = mutableListOf<String>()
    var alumnoLower: String
    var cont = 1
    while (true) {
        try {
            val alumno = readLine()!!.trim().capitalize()
            alumnoLower = alumno.lowercase()
            if (alumnoLower == "x") break
            if (alumnoLower.isEmpty()) {
                throw IllegalArgumentException("No puede estar vacío")
            }
            if (alumnoLower.any { it.isDigit() }) {
                throw IllegalArgumentException("No puede contener números")
            }
            alumnos.add(alumno)
            cont++
        } catch (e: IllegalArgumentException) {
            println("***ERROR*** ${e.message}")
        }
    }
    return alumnos
}

fun main() {
    limpiarPantalla()
    val alumnosPrimaria = mostrarNombres("Dame los alumnos de primaria (x para salir)")
    println(alumnosPrimaria)
    val alumnosSecundaria = mostrarNombres("Dame los alumnos de secundaria (x para salir)")
    println(alumnosSecundaria)
}
