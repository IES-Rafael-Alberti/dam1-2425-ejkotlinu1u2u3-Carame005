package com.dam1.unidad3
fun limpiarPantalla() {
    val os = System.getProperty("os.name")
    if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
        Runtime.getRuntime().exec("clear")
    } else {
        Runtime.getRuntime().exec("cls")
    }
}

fun grupComun(conj1: Set<String>, conj2: Set<String>): Set<String> {
    val nuevoConj = mutableSetOf<String>()
    for (conj in conj1) {
        if (conj in conj2) {
            nuevoConj.add(conj)
        }
    }
    return nuevoConj
}

fun grupNotComun(conj1: Set<String>, conj2: Set<String>): Set<String> {
    val nuevoConj = mutableSetOf<String>()
    for (conj in conj1) {
        if (conj !in conj2) {
            nuevoConj.add(conj)
        }
    }
    return nuevoConj
}

fun main() {
    limpiarPantalla()
    val frutas1 = setOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = setOf("manzana", "pera", "durazno", "sandía", "uva")

    val frutasComunes = grupComun(frutas1, frutas2)
    val frutasSoloEnFrutas1 = grupNotComun(frutas1, frutas2)
    val frutasSoloEnFrutas2 = grupNotComun(frutas2, frutas1)

    println(frutasComunes)
    println(frutasSoloEnFrutas1)
    println(frutasSoloEnFrutas2)
}
