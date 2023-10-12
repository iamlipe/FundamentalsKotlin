package Functions.params

fun sum(num1: Int, num2: Int = 0, num3: Int): Int {
    return num1 + num2
}

fun main() {
    val sum = sum(1, num3 = 40)
    println(sum)
}
