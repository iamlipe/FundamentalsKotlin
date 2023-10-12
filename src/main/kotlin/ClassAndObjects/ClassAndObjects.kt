package ClassAndObjects

import ClassAndObjects.entities.Player

fun main() {
    val player = Player()

    player.kart = "Kart do Mario"
    player.plain = "planador de bolinhas"
    player.tire = "pneu de chuva"

    player.accelerate(80)

    val power = player.power()

    println(power)
}
