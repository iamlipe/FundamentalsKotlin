package AbstractAndInheritance.entities

class Bird : Animal() {
    fun fly() = println("Voando")

    override fun run() {
        super.run()
        println("como um passaro")
    }

    override fun splep() {
        println("Passaro dormindo")
    }
}
