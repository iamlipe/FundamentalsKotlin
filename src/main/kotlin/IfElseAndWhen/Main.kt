package IfElseAndWhen

fun main(args: Array<String>) {
    val studentGrade = 5
    val condition = studentGrade >= 6;

    if (condition) {
        println("Aluno Aprovado!")
    } else {
        println("Aluno Reprovado!")
    }

    val option = 2

    if (option in 1..3) {
        println("Opção está entre 1 e 3")
    } else {
        println("Opção não esta entre 1 e 3")
    }

    val payment = 1

    when (payment) {
        1 -> println("Cartão de credito")
        2 -> println("Cartão de debito")
        3 -> println("Boleto")

        else -> println("Nenhuma opção selecionada!")
    }
}
