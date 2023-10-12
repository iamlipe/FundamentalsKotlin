package ClassAndObjects.entities

class Player {
    var kart = ""
    var tire = ""
    var plain = ""

    fun accelerate(kmh: Int) {
        println("Acelerar na velocidade $kmh")
    }

    fun power(): String {
        return "Banana"
    }
}
