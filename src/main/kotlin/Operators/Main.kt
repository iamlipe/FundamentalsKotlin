package Operators

fun main(args: Array<String>) {
    val n1 = 10
    val n2 = 20

    val sum = n1 + n2 // 30
    println(sum)

    val sub = n1 - n2; // -10
    println(sub)

    val mult = n1 * n2 // 200
    println(mult)

    val div = n1 / n2 // 0
    println(div)

    val condiction1 = n1 < n2 && n1 == n2 // false
    println(condiction1);

    val condiction2 = n1 < n2 || n1 == n2 // true
    println(condiction2);

    val condiction3 = !true // false
    println(condiction3)

}
