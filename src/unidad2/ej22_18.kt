package com.dam1.unidad2
fun pedirNum(): Int {
    print("Dame un número entero positivo: ")
    return readLine()?.toIntOrNull() ?: -1
}

fun main() {
    var numero = pedirNum()
    var par = 0
    while (numero != -1) {
        val sumaDigitos = numero.toString().sumOf { it.toString().toInt() }
        println("La suma de los dígitos es: $sumaDigitos")
        if (numero % 2 == 0) {
            par++
        }
        numero = pedirNum()
    }
    println("Cantidad de números pares ingresados: $par")
}
