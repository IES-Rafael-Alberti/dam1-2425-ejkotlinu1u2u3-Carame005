package com.dam1.unidad2
fun menu(): Int? {
    println("\nMenu:")
    println("1. Comenzar programa")
    println("2. Imprimir listado")
    println("3. Finalizar Programa")
    return try {
        print("Seleccione una opción: ")
        readLine()?.toInt()
    } catch (e: NumberFormatException) {
        println("Opción inválida. Por favor, ingrese un número.")
        null
    }
}

fun ejecutarOpcion(opcion: Int?): String {
    return when (opcion) {
        1 -> "Programa iniciado"
        2 -> "Imprimiendo documentos"
        3 -> "Programa finalizado"
        else -> "Opción inválida"
    }
}

fun main() {
    while (true) {
        val opcion = menu()
        val mensaje = ejecutarOpcion(opcion)
        println(mensaje)
        if (opcion == 3) {
            break
        }
    }
}
