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

fun main() {
    limpiarPantalla()
    val datos = """nif;nombre;email;teléfono;descuento
    01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5
    71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
    63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2
    98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"""

    val lineas = datos.trim().split("\n")
    val campos = lineas[0].split(";")
    val clientsDict = mutableMapOf<String, Map<String, String>>()

    for (linea in lineas.drop(1)) {
        val valores = linea.split(";")
        val nif = valores[0]
        val clientInfo = campos.drop(1).zip(valores.drop(1)).toMap()
        clientsDict[nif] = clientInfo
    }

    println(clientsDict)
}
