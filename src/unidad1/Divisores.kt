package com.dam1.unidad1
fun divisores(n: Int): List<Int> {
    return (1..n).filter { n % it == 0 }
}

fun main() {
    print("Ingrese un número: ")
    val numero = readLine()?.toIntOrNull() ?: return println("Número inválido")
    println(divisores(numero))
}
