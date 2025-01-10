package com.dam1.unidad3
import kotlin.system.exitProcess

val alphabetString = "abcdefghijklmnopqrstuvwxyz"
val abecedario = alphabetString.toSet()

fun limpiarPantalla() {
    val os = System.getProperty("os.name")
    if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
        Runtime.getRuntime().exec("clear")
    } else {
        Runtime.getRuntime().exec("cls")
    }
}

fun sacarConsonantes(conj1: Set<Char>, conj2: Set<Char>): Set<Char> {
    val consonante = mutableSetOf<Char>()
    for (conj in conj1) {
        if (conj !in conj2) {
            consonante.add(conj)
        }
    }
    return consonante
}

fun comunes(conj1: Set<Char>, conj2: Set<Char>): Set<Char> {
    val comun = mutableSetOf<Char>()
    for (conj in conj1) {
        if (conj in conj2) {
            comun.add(conj)
        }
    }
    return comun
}

fun main() {
    limpiarPantalla()
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    val consonantes = sacarConsonantes(abecedario, vocales)

    val letrasComunes = comunes(consonantes, vocales)

    println(consonantes.sorted())
    if (letrasComunes.isEmpty()) {
        println("No hay letras comunes")
    }
}
