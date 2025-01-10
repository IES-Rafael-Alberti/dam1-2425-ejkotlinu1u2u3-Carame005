package com.dam1.unidad2
fun pideNumero(): String {
    print("Dame un numero: ")
    return readLine() ?: ""
}

fun main() {
    val n = pideNumero()
    try {
        val numero = n.toInt()
        if (numero > 0) {
            println(numero)
        } else if (numero < 0) {
            throw ValueError("La entrada no es correcta")
        }
    } catch (e: NumberFormatException) {
        if (n.isEmpty()) {
            println("Error: El numero introducido no es un entero valido")
        } else {
            println("Error: Ha ocurrido un error inesperado. ${e.message}")
        }
    } catch (e: ValueError) {
        println("Error: ${e.message}")
    }
}

class ValueError(message: String) : Exception(message)
