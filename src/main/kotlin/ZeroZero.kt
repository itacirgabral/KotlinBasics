import java.io.IOException

fun main() {
    val name = "italir"

    var nome: String
    nome = "$name gabral ${1 + 1}"

    val arr = arrayOf(0, 10, 20, 30)
    val arr2 = Array(10, { k -> k * k })

    val alfabeto = 'a'..'z'

    val file = try {
        readFile()
        true
    } catch (e: IOException) {
        false
    }

    println("Hello, World!")
}