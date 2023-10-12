package AbstractAndInheritance

import AbstractAndInheritance.entities.Bird
import AbstractAndInheritance.entities.Dog

fun main() {
    val dog = Dog()
    dog.run()
    dog.bark()

    val bird = Bird()
    bird.run()
    bird.fly()
}
