package com.dam1.unidad2
fun pideNumero(): String {
    print("Dame un numero: ")
    return readLine() ?: ""
}

fun main() {
    val n = pideNumero().toIntOrNull()
    if (n == null || n <= 0) {
        println("Número denegado, debe ser positivo")
        return
    } else {
        val cadena = mutableListOf<String>()
        for (i in 1..n step 2) {
            cadena.add(i.toString())
        }
        println(cadena.joinToString(", "))
    }
}
