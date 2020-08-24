sealed class Mammal (val name: String)

class Human(val humanName: String, val job: String): Mammal(humanName)
class Cat(val catName: String): Mammal(catName)

fun greetMammal(mammal: Mammal): String{
    when(mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}