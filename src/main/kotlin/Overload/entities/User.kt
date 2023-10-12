package Overload.entities

class User {
    fun login(email: String, password: String) {
        println("User logged with email: $email and passwor: $password")
    }

    fun login(phone: String) {
        println("User logged with phone: $phone")
    }
}
