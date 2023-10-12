package Overload

import Overload.entities.User

fun main() {
    val user = User()

    user.login("maria@gmail.com", "12345678")
    user.login("11999999999")
}
