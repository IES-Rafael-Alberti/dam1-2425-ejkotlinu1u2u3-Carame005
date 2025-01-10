package com.dam1.unidad2
fun main() {
    print("Ingrese la contraseña: ")
    val contraseña = readLine()?.lowercase() ?: ""
    println("Contraseña guardada correctamente.")

    print("¿Qué contraseña puso? ")
    var contraseña1 = readLine()?.lowercase() ?: ""

    while (contraseña1 != contraseña) {
        println("Contraseña incorrecta. Inténtelo de nuevo.")
        print("¿Qué contraseña puso? ")
        contraseña1 = readLine()?.lowercase() ?: ""
    }

    println("Contraseña correcta.")
}
