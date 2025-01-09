package com.dam1.unidad1
fun main() {
    print("Introduce tu correo electrónico: ")
    val correo = readLine() ?: ""

    if ("@" in correo) {
        val partes = correo.split("@", limit = 2)
        val nombre = partes[0]
        val nuevoCorreo = "$nombre@ceu.es"
        println("Tu nuevo correo es: $nuevoCorreo")
    } else {
        println("Por favor, introduce un correo electrónico válido.")
    }
}
