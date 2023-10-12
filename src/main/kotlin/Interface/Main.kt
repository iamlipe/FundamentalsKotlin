package Interface

import Interface.entities.Developer
import Interface.entities.Doctor
import Interface.entities.Journalist

fun main() {
    val developer = Developer()
    val doctor = Doctor()
    val journalist = Journalist()

    developer.eat()

    doctor.eat()

    journalist.eat()
    journalist.apply()
}
