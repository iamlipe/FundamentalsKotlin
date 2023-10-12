package Companion

import Companion.entities.Car
import Companion.entities.User

fun main() {
    val fusca = Car("Fusca", 100)
    println(fusca)

    val ferrari = Car("Ferrari", 300)
    println(ferrari)

    println(Car.displayMaxSpeedAllowed())

    val isLogged = User.VerifyLogin()
    println("Usuario logado: $isLogged")
}
