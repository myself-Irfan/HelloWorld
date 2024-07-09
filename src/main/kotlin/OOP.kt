fun oopMain() {
    val u1 = Usr(age = 27, fName = "Irfan", lName = "Ahmed")
    val u2 = Usr("Ashek", "Ahmed", 29)

    println(u1.fstName)
    println(u2.fstName)

    val uc1 = Usr2Cons("iRFaN", "Ahmed", 27)
    uc1.introduceSelf()

    val uc2 = Usr2Cons(" Ashek ")
    uc2.introduceSelf()

    val uc3 = Usr2Cons(lName="Benozir", fName="Islam")
    uc3.introduceSelf()

    val dv = DefaultVal(age = 23)
    dv.introduceSelf()
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

