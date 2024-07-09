// required params
class Car(name: String, var model: String, var color: String, doorNo: Int) {
    /*
    This class demonstrates class creation -> simple param, init, method define
     */

    var name = name.trim()
    var doorQ: Int

    init {
        if (doorNo > 1) {
            doorQ = doorNo
        } else {
            doorQ = 2
            println("Must have 1+ doors")
        }
    }

    fun move() {
        println("$name Moving")
    }

    fun stop() {
        println("$name Stopped")
    }
}


class Usr(fName: String, lName: String, age: Int) {
    /*
    This class demonstrates usage of initializers
     */

    var fstName: String
    var lstName: String
    var uAge: Int

    init {
        if (fName.lowercase().startsWith('i')) {
            fstName = fName
        } else {
            fstName = "User"
            println("First name must start with 'I/i'")
        }

        if (lName.lowercase().contains(Regex("[aeiou]"))) {
            lstName = lName
        }
        else {
            lstName = "Doe"
            println("Last name must contain a vowel")
        }

        if (age < 18) {
            uAge = 18
            println("Age must be equal or greater to 18")
        } else {
            uAge = age
        }
    }
}


class Usr2Cons(var fName: String, var lName: String, var age: Int) {
    /*
    Demonstrate usage of secondary constructor
     */
    companion object {
        val className = Usr2Cons::class.simpleName
    }

    init {
        fName = fName.trim().lowercase().replaceFirstChar { it.uppercase() }
        lName = lName.trim().lowercase().replaceFirstChar { it.uppercase() }
        if (age < 18) age = 18
    }

    constructor(fName: String): this(fName, "doe", 18) {
        println("Secondary constructor -> Only fName received")
    }

    constructor(fName: String, lName: String): this(fName, lName, 18) {
        println("Secondary constructor -> Only fName & lName received")
    }

    fun introduceSelf () {
        println("$className ${::introduceSelf.name} says $fName $lName is $age years old")
    }
}


class DefaultVal(var fName: String = "John", var lName: String = "Doe", var age: Int = 18) {
    companion object {
        val className = DefaultVal::class.simpleName
    }

    fun introduceSelf () {
        println("${className} ${::introduceSelf.name} says $fName $lName is $age years old")
    }
}