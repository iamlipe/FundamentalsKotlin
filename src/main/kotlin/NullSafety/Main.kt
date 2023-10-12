package NullSafety

class Carro {
    var color = "vermelho"
}

fun main(args: Array<String>) {
    val carro: Carro? = null
    val color = carro?.color ?: "red"
    println(color);
}
