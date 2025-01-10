package com.dam1.unidad3
import java.util.*

fun limpiarPantalla() {
    val os = System.getProperty("os.name").toLowerCase()
    if (os.contains("win")) {
        Runtime.getRuntime().exec("cls")
    } else {
        Runtime.getRuntime().exec("clear")
    }
}

fun crearDiccionario(): Map<String, String> {
    print("Introduce las palabras en formato 'palabra:traducción', separadas por comas: ")
    val entrada = readLine() ?: ""
    val pares = entrada.split(",")
    val diccionario = mutableMapOf<String, String>()

    for (par in pares) {
        val claveValor = par.trim()
        if (!claveValor.contains(":")) {
            println("Advertencia: el par '$claveValor' no está en el formato correcto (palabra:traducción), se omite.")
            continue
        }
        val (clave, valor) = claveValor.split(":")
        diccionario[clave.trim().toLowerCase()] = valor.trim()
    }

    return diccionario
}

fun traducirFrase(diccionario: Map<String, String>): String {
    print("Introduce una frase en español: ")
    val frase = readLine() ?: ""
    val palabras = frase.split(" ")
    val traduccion = palabras.map { palabra ->
        diccionario.getOrDefault(palabra.toLowerCase(), palabra)
    }

    return traduccion.joinToString(" ")
}

fun main() {
    limpiarPantalla()
    println("Crea tu diccionario de traducción:")
    val diccionario = crearDiccionario()
    println("\nTu diccionario es: $diccionario")
    println("\nTraduce una frase:")
    val fraseTraducida = traducirFrase(diccionario)
    println("\nFrase traducida: $fraseTraducida")
}
