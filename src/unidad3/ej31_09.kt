package com.dam1.unidad3
import java.io.IOException

val VOCALES = listOf('a', 'e', 'i', 'o', 'u')

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

fun cuenta(palabra: String) {
    var a = 0
    var e = 0
    var i = 0
    var o = 0
    var u = 0

    for (letra in palabra) {
        when (letra) {
            'a' -> a++
            'e' -> e++
            'i' -> i++
            'o' -> o++
            'u' -> u++
        }
    }

    println("a: $a")
    println("e: $e")
    println("i: $i")
    println("o: $o")
    println("u: $u")
}

fun main() {
    limpiarPantalla()
    print("Dame una palabra: ")
    val palabra = readLine()?.lowercase() ?: ""
    cuenta(palabra)
}
