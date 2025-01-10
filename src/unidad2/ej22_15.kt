package com.dam1.unidad2
fun ingresaNumero(): Int {
    print("Ingresa un numero: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun main() {
    var n = ingresaNumero()
    var cont = 0
    while (n != 0) {
        if (n > 0) {
            cont += n
        }
        n = ingresaNumero()
    }
    println(cont)
}
