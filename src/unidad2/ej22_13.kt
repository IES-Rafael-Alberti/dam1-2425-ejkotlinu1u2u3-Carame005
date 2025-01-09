package com.dam1.unidad2
fun pedirPalabra(): String {
    print("Introduce cualquier cosa o 'salir' para terminar: ")
    return readLine() ?: ""
}

fun main() {
    var palabra = pedirPalabra()
    while (palabra != "salir") {
        println(palabra)
        palabra = pedirPalabra()
    }
    println("Fin del programa")
}
