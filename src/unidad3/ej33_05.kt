package com.dam1.unidad3
fun limpiarPantalla() {
    val os = System.getProperty("os.name")
    if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
        Runtime.getRuntime().exec("clear")
    } else {
        Runtime.getRuntime().exec("cls")
    }
}

fun esPar(conjs: Set<Int>): Set<Int> {
    val pares = mutableSetOf<Int>()
    for (conj in conjs) {
        if (conj % 2 == 0) {
            pares.add(conj)
        }
    }
    return pares
}

fun mult3(conjs: Set<Int>): Set<Int> {
    val mult = mutableSetOf<Int>()
    for (conj in conjs) {
        if (conj % 3 == 0) {
            mult.add(conj)
        }
    }
    return mult
}

fun intersecciones(conjs1: Set<Int>, conjs2: Set<Int>): Set<Int> {
    val inter = mutableSetOf<Int>()
    for (conj in conjs1) {
        if (conj in conjs2) {
            inter.add(conj)
        }
    }
    return inter
}

fun main() {
    limpiarPantalla()
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = esPar(numeros)

    val multiplosDeTres = mult3(numeros)

    val interseccion = intersecciones(pares, multiplosDeTres)

    println(pares)
    println(multiplosDeTres)
    println(interseccion)
}
