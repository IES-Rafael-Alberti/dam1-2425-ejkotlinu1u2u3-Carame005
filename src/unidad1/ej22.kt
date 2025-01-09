package com.dam1.unidad1
fun main() {
    print("Introduce una frase: ")
    val frase = readLine() ?: ""

    print("Introduce una vocal: ")
    val vocal = readLine() ?: ""

    if (vocal.length != 1 || vocal.lowercase() !in listOf("a", "e", "i", "o", "u")) {
        println("Por favor, introduce una sola vocal válida (a, e, i, o, u).")
    } else {
        val fraseModificada = frase.replace(vocal, vocal.uppercase(), ignoreCase = true)
        println("Frase modificada: $fraseModificada")
    }
}
