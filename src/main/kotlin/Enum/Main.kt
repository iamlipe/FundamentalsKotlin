package Enum

import Enum.entities.Order
import Enum.entities.OrderStatus

fun main() {
    val order = Order(125.90, "Camiseta, Livro")

    println(order.status) // WAINTING

    order.status = OrderStatus.CONFIRMED
    println(order.status) // CONFIRMED

    order.status = OrderStatus.DELIVERED
    println(order.status.ordinal) // 2
}
