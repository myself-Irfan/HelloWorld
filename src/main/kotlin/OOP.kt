fun oopMain() {
    val u1 = Usr("Irfan", "Ahmed", 27)
    val u2 = Usr("Ashek", "Ahmed", 29)

    println(u1.fstName)
    println(u2.fstName)
}


fun objCreation() {
    val c1 = Car("Tesla", "Model S", "Grey", 4)
    val c2 = Car("Ford", "Mustang", "Red", 2)
    val c3 = Car("Audi", "A4", "Silver", 4)

    c1.model="Model V"

    println("Model: ${c1.model}")
    c1.move()
    c2.stop()
}


// classes are defined in Classes.kt

