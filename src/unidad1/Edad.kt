package com.dam1.unidad1
fun esMayorDeEdad(edad: Int): Boolean {
    return edad >= 18
}

fun comprobarEdad(valor: String?): Boolean {
    return try {
        val edad = valor?.toInt()
        edad != null && edad > 0
    } catch (e: NumberFormatException) {
        false
    }
}

fun introducirEdad(msj: String): Int {
    var valor: String?
    do {
        print(msj)
        valor = readLine()
        if (!comprobarEdad(valor)) {
            println("Error: Debes introducir una edad válida (un número mayor que 0).")
        }
    } while (!comprobarEdad(valor))
    return valor!!.toInt()
}

fun main() {
    val edad = introducirEdad("Introduce tu edad: ")
    if (esMayorDeEdad(edad)) {
        println("Eres legal")
    } else {
        println("No eres legal")
    }
}
