package Lateinit

import Lateinit.entities.Product

fun main() {
    val product = Product()

    // NÃO PODE ESQUECER DE INICIALIZAR O ATRIBUTO LATEINIT DESCRIPTION
    // CASO ESQUECA , O CODIGO NAO SER A COMPILADO
    product.description = "Macbook"

    println(product.description)
}
