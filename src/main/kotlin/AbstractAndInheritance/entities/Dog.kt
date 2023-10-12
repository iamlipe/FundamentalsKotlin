package AbstractAndInheritance.entities

class Dog : Animal() {
    fun bark() = println("Latindo")

    override fun run() {
        super.run()
        println("como um cachorro")
    }

    override fun splep() {
        println("Cachorro dormindo")
    }
}
