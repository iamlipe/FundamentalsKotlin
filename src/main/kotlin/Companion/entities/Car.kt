package Companion.entities

class Car(
    var model: String = "",
    var speed: Int = 0
) {

    // BASICAMENTE SÃO METODOS ESTATICOS "STATIC"
    companion object {
        val MAX_SPEED_ALLOWED = 120

        fun displayMaxSpeedAllowed() = "Velocida maxima permitida: $MAX_SPEED_ALLOWED"
    }

    override fun toString(): String {
        return "Car(model='$model', speed=$speed)"
    }
}
