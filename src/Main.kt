fun main(args: Array<String>) {

    //Data Class Demo
    val person = Person("Prince", 1)
    println(person)

    val secondPerson = Person("Prince", 1)
    val thirdPerson = Person("Max", 2)

    println("person == secondPerson : ${person == secondPerson}")
    println("person == thirdPerson : ${person == thirdPerson}")

    println(person.hashCode())
    println(thirdPerson.hashCode())

    //Copy function
    println(person.copy())
    println(person.copy("Max"))
    println(person.copy(id = 2))

    println("name = ${person.component1()}")
    println("id = ${person.component2()}")

    //Enum demo
    println("State Enum Print Out :")

    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's Idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    println("Color Enum Print Out :")
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())

    //Seal Class Demo
    println(greetMammal(Cat("Sunny")))
    println(greetMammal(Human("Otis", "Software Engineer")))
}
