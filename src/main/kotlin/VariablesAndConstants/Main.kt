package VariablesAndConstants

// — > Valor deve ser explicito no momento em que a constante e instanciada.
const val username = "@iamlipe"

fun main(args: Array<String>) {
    // Variavel -- > Consigo alterar o valor da variavel.
    var name = "Maria" // -- > A variavel instacia o tipo da variavel automaticamente.
    var lastName: String = "Brown" // -- > Consigo definir o tipo da varivel.

    println("$name $lastName") // Maria Brown

    name = "Alex"
    lastName = "Green"

    println("$name $lastName") // Alex Green

    // Constante --> Não consigo alterar o valor da veriavel.
    val number1 = 20
    val number2 = 30
    val result = number1 + number2;
    println(result) // 50

}
