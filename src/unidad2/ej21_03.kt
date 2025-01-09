package com.dam1.unidad2
fun comprobarNumero(valor: Int): Boolean {
    return valor != 0
}

fun main() {
    print("Introduzca el dividendo: ")
    val D = readLine()?.toIntOrNull() ?: 0

    print("Introduzca el divisor: ")
    var d = readLine()?.toIntOrNull() ?: 0

    while (!comprobarNumero(d)) {
        println("Error: El divisor no puede ser cero")
        print("Introduzca el divisor: ")
        d = readLine()?.toIntOrNull() ?: 0
    }

    println((D.toDouble() / d))
}
