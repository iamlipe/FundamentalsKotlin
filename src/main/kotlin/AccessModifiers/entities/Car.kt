package AccessModifiers.entities

open class Car {
    private var model = ""

    protected open fun injectFuel() {
        println("Injeção de combistivel")
    }

    fun accelerate() {
        injectFuel()
        println("Acelerar carro!")
    }
}
