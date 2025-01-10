import java.io.IOException

fun limpiarPantalla() {
    try {
        val os = System.getProperty("os.name").toLowerCase()
        if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            Runtime.getRuntime().exec("clear")
        } else {
            Runtime.getRuntime().exec("cls")
        }
    } catch (e: IOException) {
        println("Error al intentar limpiar la pantalla")
    }
}

fun main() {
    limpiarPantalla()
    val numeros = mutableListOf<Int>()

    while (true) {
        print("Dame los numeros de la loteria (0 para salir): ")
        val n = readLine()?.toIntOrNull() ?: 0
        if (n == 0) break
        numeros.add(n)
    }

    numeros.sort()
    println(numeros)
}
