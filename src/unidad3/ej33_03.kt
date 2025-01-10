package com.dam1.unidad3
import java.util.*

fun limpiarPantalla() {
    val os = System.getProperty("os.name")
    if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
        Runtime.getRuntime().exec("clear")
    } else {
        Runtime.getRuntime().exec("cls")
    }
}

fun conjuntoPotencia(conjuntoOriginal: Set<Int>): List<Set<Int>> {
    val potencia = mutableListOf<Set<Int>>(emptySet())
    for (elemento in conjuntoOriginal) {
        val nuevosSubconjuntos = mutableListOf<Set<Int>>()
        for (subconjunto in potencia) {
            nuevosSubconjuntos.add(subconjunto + elemento)
        }
        potencia.addAll(nuevosSubconjuntos)
    }
    return potencia
}

fun main() {
    limpiarPantalla()
    val conjunto = setOf(6, 1, 4)
    val res = conjuntoPotencia(conjunto)
    println(res)
}
