import java.io.File

fun mostrarMenuOpciones(opciones: List<String>): Int {
    opciones.forEachIndexed { index, opcion ->
        println("${index + 1}. $opcion")
    }
    println("0. Salir")
    print("Elige una opción: ")
    return readLine()?.toIntOrNull() ?: -1
}

fun mostrarCarpetas(basePath: String): String? {
    val baseDir = File(basePath)
    if (!baseDir.exists() || !baseDir.isDirectory) {
        println("El directorio base no existe o no es una carpeta válida.")
        return null
    }

    val carpetas = baseDir.listFiles { file -> file.isDirectory }?.map { it.name } ?: emptyList()
    if (carpetas.isEmpty()) {
        println("No se encontraron carpetas en el directorio base.")
        return null
    }

    println("Unidades disponibles:")
    val opcion = mostrarMenuOpciones(carpetas)
    if (opcion == 0) return null
    if (opcion in 1..carpetas.size) {
        return "${basePath}/${carpetas[opcion - 1]}"
    } else {
        println("Opción no válida.")
        return null
    }
}

fun mostrarArchivos(carpeta: String): String? {
    val dir = File(carpeta)
    val archivos = dir.listFiles { file -> file.isFile }?.map { it.name } ?: emptyList()
    if (archivos.isEmpty()) {
        println("No se encontraron ejercicios en la carpeta seleccionada.")
        return null
    }

    println("Ejercicios disponibles:")
    val opcion = mostrarMenuOpciones(archivos)
    if (opcion == 0) return null
    if (opcion in 1..archivos.size) {
        return "${carpeta}/${archivos[opcion - 1]}"
    } else {
        println("Opción no válida.")
        return null
    }
}

fun main() {
    val basePath = "./Ejercicios"
    while (true) {
        println("Selecciona una unidad:")
        val carpetaSeleccionada = mostrarCarpetas(basePath) ?: break

        println("Selecciona un ejercicio:")
        val archivoSeleccionado = mostrarArchivos(carpetaSeleccionada) ?: break

        println("Has seleccionado el archivo: $archivoSeleccionado")

    }
    println("Saliendo del programa.")
}
