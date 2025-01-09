package com.dam1.unidad1
import kotlin.math.sqrt

fun tieneMasDeUnPunto(valor: String): Boolean {
    val posPunto = valor.indexOf(".")
    return if (posPunto >= 0 && valor.indexOf(".", posPunto + 1) >= 0) {
        false
    } else {
        true
    }
}

fun contieneSoloDigitosYPunto(valor: String): Boolean {
    for (i in valor.indices) {
        if (!(valor[i].isDigit() || valor[i] == '.')) {
            return false
        }
    }
    return true
}

fun comprobarNumero(valor: String): Boolean {
    var num = valor
    if (num.startsWith("-")) {
        num = num.substring(1)
        if (num.isEmpty()) {
            return false
        }
    }

    if (!tieneMasDeUnPunto(num)) {
        return false
    }

    return contieneSoloDigitosYPunto(num)
}

fun calcularArea(ladoA: Double, ladoB: Double, ladoC: Double): Double {
    val semiperimetro = (ladoA + ladoB + ladoC) / 2
    return sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC))
}

fun dameNumero(msj: String): Double {
    var num: String?
    do {
        print(msj)
        num = readLine()?.trim()
        if (num == null || !comprobarNumero(num)) {
            println("Error: Debes introducir un número válido.")
        }
    } while (num == null || !comprobarNumero(num))
    return num.toDouble()
}

fun main() {
    println("Introduce los lados del triángulo:")

    val ladoA = dameNumero("Lado A: ")
    val ladoB = dameNumero("Lado B: ")
    val ladoC = dameNumero("Lado C: ")

    val area = calcularArea(ladoA, ladoB, ladoC)
    println("El área del triángulo es: %.2f".format(area))
}
