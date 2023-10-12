package AbstractAndInheritance.entities

abstract class Animal {
    var color: String = ""
    var size: String = ""
    var weight: Double = 0.0

    open fun run() = print("Correndo ")
    
    abstract fun splep();
}
