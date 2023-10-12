package Enum.entities

class Order(
    var total: Double = 0.0,
    var items: String = "",
    var status: OrderStatus = OrderStatus.WAINTING
) {

}
