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

fun gestionarBaseDatos() {
    val clientes = mutableMapOf<String, MutableMap<String, Any>>()

    while (true) {
        println("\nMenú de opciones:")
        println("1. Añadir cliente")
        println("2. Eliminar cliente")
        println("3. Mostrar cliente")
        println("4. Listar todos los clientes")
        println("5. Listar clientes preferentes")
        println("6. Terminar")

        print("Elige una opción (1-6): ")
        val opcion = readLine()

        when (opcion) {
            "1" -> {
                print("Introduce el NIF del cliente: ")
                val nif = readLine().toString()
                if (clientes.containsKey(nif)) {
                    println("El cliente ya existe.")
                } else {
                    print("Introduce el nombre del cliente: ")
                    val nombre = readLine().toString()
                    print("Introduce la dirección del cliente: ")
                    val direccion = readLine().toString()
                    print("Introduce el teléfono del cliente: ")
                    val telefono = readLine().toString()
                    print("Introduce el correo del cliente: ")
                    val correo = readLine().toString()
                    print("¿Es cliente preferente? (sí/no): ")
                    val preferente = readLine()?.trim()?.lowercase() == "sí"
                    clientes[nif] = mutableMapOf(
                        "nombre" to nombre,
                        "dirección" to direccion,
                        "teléfono" to telefono,
                        "correo" to correo,
                        "preferente" to preferente
                    )
                    println("Cliente añadido correctamente.")
                }
            }
            "2" -> {
                print("Introduce el NIF del cliente a eliminar: ")
                val nif = readLine().toString()
                if (clientes.containsKey(nif)) {
                    clientes.remove(nif)
                    println("Cliente eliminado correctamente.")
                } else {
                    println("El cliente no existe.")
                }
            }
            "3" -> {
                print("Introduce el NIF del cliente: ")
                val nif = readLine().toString()
                if (clientes.containsKey(nif)) {
                    val cliente = clientes[nif]
                    println("\nDatos del cliente:")
                    cliente?.forEach { (clave, valor) ->
                        println("${clave.capitalize()}: $valor")
                    }
                } else {
                    println("El cliente no existe.")
                }
            }
            "4" -> {
                if (clientes.isNotEmpty()) {
                    println("\nLista de todos los clientes:")
                    clientes.forEach { (nif, datos) ->
                        println("NIF: $nif, Nombre: ${datos["nombre"]}")
                    }
                } else {
                    println("No hay clientes registrados.")
                }
            }
            "5" -> {
                val preferentes = clientes.filter { it.value["preferente"] == true }
                    .map { "NIF: ${it.key}, Nombre: ${it.value["nombre"]}" }
                if (preferentes.isNotEmpty()) {
                    println("\nLista de clientes preferentes:")
                    preferentes.forEach { println(it) }
                } else {
                    println("No hay clientes preferentes registrados.")
                }
            }
            "6" -> {
                println("Saliendo del programa. ¡Hasta luego!")
                break
            }
            else -> {
                println("Opción no válida. Por favor, elige una opción del 1 al 6.")
            }
        }
    }
}

fun main() {
    limpiarPantalla()
    gestionarBaseDatos()
}

