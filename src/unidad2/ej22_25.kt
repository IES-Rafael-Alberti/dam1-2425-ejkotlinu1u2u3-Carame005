package com.dam1.unidad2
fun ingresaFrase(): String {
    print("Ingrese una frase: ")
    return readLine() ?: ""
}

fun obtenerPalabraMasLargaYConteo(frase: String): Pair<String, Int> {
    val palabras = frase.split(" ")
    val palabraMasLarga = palabras.maxByOrNull { it.length } ?: ""
    return palabraMasLarga to palabras.size
}

fun main() {
    val frase = ingresaFrase()
    val (palabraMasLarga, totalPalabras) = obtenerPalabraMasLargaYConteo(frase)
    println("La palabra más larga es: $palabraMasLarga")
    println("Número total de palabras: $totalPalabras")
}
