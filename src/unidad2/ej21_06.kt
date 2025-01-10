package com.dam1.unidad2
fun comprobarSexo(): String {
    print("Dame tu sexo (hombre/mujer): ")
    return readLine()?.lowercase() ?: ""
}

fun comprobarNombre(): String {
    print("Dame tu nombre: ")
    return readLine()?.uppercase() ?: ""
}

fun main() {
    val sexo = comprobarSexo()
    val nombre = comprobarNombre()

    if (sexo == "mujer" && nombre[0] < 'M') {
        println("Tu grupo es A")
    } else if (sexo == "hombre" && nombre[0] > 'N') {
        println("Tu grupo es A")
    } else {
        println("Tu grupo es B")
    }
}
