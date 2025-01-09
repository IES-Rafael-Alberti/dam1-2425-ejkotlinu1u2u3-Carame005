package com.dam1.unidad2
fun calcularPuntuacion(valor: Double): Double {
    return 2400 * valor
}

fun main() {
    val valorTexto = mapOf(
        0.0 to "rendimiento inaceptable",
        0.4 to "rendimiento aceptable",
        0.6 to "rendimiento meritorio",
        0.8 to "rendimiento inmejorable",
        1.0 to "rendimiento excelente"
    )

    print("Introduce un valor (0.0, 0.4, 0.6, 0.8, 1.0): ")
    val puntos = readLine()?.toDoubleOrNull() ?: return println("Valor no válido.")

    val puntuacion = calcularPuntuacion(puntos)

    if (valorTexto.containsKey(puntos)) {
        println("Tus ingresos son de: $puntuacion € y tu ${valorTexto[puntos]}")
    } else {
        println("Valor no válido.")
    }
}
