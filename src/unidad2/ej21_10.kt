package com.dam1.unidad2
fun preguntarPizza(): String {
    print("¿Qué tipo de pizza quieres? (vegetariana, no vegetariana): ")
    return readLine()?.lowercase() ?: ""
}

fun main() {
    val vegetariana = mutableListOf("mozzarella", "tomate", "pimiento", "tofu")
    val noVegetariana = mutableListOf("mozzarella", "tomate", "peperoni", "jamón", "salmón")

    val pizza = preguntarPizza()

    if (pizza == "vegetariana") {
        print("Dime qué único ingrediente quieres que lleve (pimiento, tofu): ")
        val ingrediente = readLine()?.lowercase() ?: ""
        when (ingrediente) {
            "pimiento" -> vegetariana.remove("tofu")
            "tofu" -> vegetariana.remove("pimiento")
        }
        println("Tu pizza vegetariana tiene ${vegetariana.joinToString()}")
    } else if (pizza == "no vegetariana") {
        print("Dime qué único ingrediente quieres que lleve (jamón, salmón, peperoni): ")
        val ingrediente = readLine()?.lowercase() ?: ""
        when (ingrediente) {
            "jamón" -> {
                noVegetariana.remove("salmón")
                noVegetariana.remove("peperoni")
            }
            "salmón" -> {
                noVegetariana.remove("jamón")
                noVegetariana.remove("peperoni")
            }
            "peperoni" -> {
                noVegetariana.remove("jamón")
                noVegetariana.remove("salmón")
            }
        }
        println("Tu pizza no vegetariana tiene ${noVegetariana.joinToString()}")
    } else {
        println("Opción no válida. Intenta de nuevo.")
    }
}
