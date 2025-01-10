package com.dam1.unidad1
fun main() {
    print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ")
    val fechaStr = readLine() ?: ""

    val partes = fechaStr.split("/")
    if (partes.size == 3) {
        val dia = partes[0].padStart(2, '0')
        val mes = partes[1].padStart(2, '0')
        val anio = partes[2]

        println("Día: $dia")
        println("Mes: $mes")
        println("Año: $anio")
    } else {
        println("Por favor, introduce la fecha en el formato correcto (dd/mm/aaaa).")
    }
}
