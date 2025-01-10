package com.dam1.unidad2
fun comprobarNumero(valor: String): Any {
    return try {
        val numero = valor.toInt()
        if (numero > 0) {
            true
        } else {
            false
        }
    } catch (e: NumberFormatException) {
        "Introduce un valor valido"
    }
}

fun main() {
    var n = readLine() ?: ""
    val cadena = mutableListOf<String>()

    while (comprobarNumero(n) != true) {
        println("Introduce un numero valido")
        n = readLine() ?: ""
    }

    for (i in n.toInt() downTo 0) {
        cadena.add(i.toString())
    }

    println(cadena.joinToString(","))
}
