package com.dam1.unidad3
import java.io.File

fun limpiarPantalla() {
    val os = System.getProperty("os.name")
    if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
        Runtime.getRuntime().exec("clear")
    } else {
        Runtime.getRuntime().exec("cls")
    }
}

fun domiciliosClientes(listaCompras: List<Triple<String, Int, Double, String>>): Set<String> {
    val domicilios = mutableSetOf<String>()
    for (compra in listaCompras) {
        domicilios.add(compra.third)
    }
    return domicilios
}

fun main() {
    limpiarPantalla()
    val listaCompras = listOf(
        Triple("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        Triple("Jorge Russo", 7, 699.0, "Mirasol 218"),
        Triple("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        Triple("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        Triple("Jorge Russo", 15, 958.0, "Mirasol 218")
    )

    val domicilios = domiciliosClientes(listaCompras)
    domicilios.sorted().forEach { println(it) }
}
