import kotlin.random.Random


fun main() {
//    explicit declaration is not mandatory since Kotlin has type inference
//    var curRealm: String = "NetherRealm"
//    val age: Int = 22
//
//    println("Hello from $curRealm, Mortal.\nYou died at $age")
//    checkInference()
//    charBool()
//

//    val isActive: Boolean = true
//    var ranNum: Int = genRandInt()

//    println("Generated Int: $ranNum")
//
//    if (isActive) {
//        if (ranNum >= 10) {
//            operators(ranNum)
//        } else if (ranNum > 0) {
//            val resPrePost = prePost(ranNum)
//            println("pre_Post result: $resPrePost")
//        } else {
//            println("$ranNum can not be less than 0")
//        }
//    } else {
//        printDataType()
//    }
//
//    /*
//     type definition since all return same data type else can not define type
//     since only one instruction per block no curly braces but for more needs curly braces
//     */
//
//    val condText: String =
//        if ((randInt1 % 2) == 0 && (randInt2 % 2 == 0)) "Generated $randInt1 $ $randInt2 are both Even"
//        else if ((randInt1 % 2) == 0 || (randInt2 % 2) == 0) "Generated $randInt1 or $randInt2 is Odd"
//        else "Generated $randInt1 and $randInt2 are both odd"
//
//    println("Conditional Text: $condText")

//    val txt: String = ctrlFlow()
//    println("ctrlFlow() result: $txt")
//    ctrlFlow2()

//    nullStr()
//    println("getMax result: ${getMax()}")
//    println("getMax result ${getMax(2.5, 3.75)}")
//    println("getMax result: ${getMax(3,3,2)}")
//
//    println("defVal: ${defVal("iA")}")

//    var resVarArg: Int = sumVarArg(1, 2, 9)
//    println("resVarArg: $resVarArg")
//
//    var resVarArg2: Int = sumVarArg2(8, 6, 3, 9)
//    println("resVargArg2: $resVarArg2")

//    loopStrChar("We are Venom")
//    forLoop()
//    println("whileLoop returns: ${whileLoop()}")
//    doWhile()

//    lContinue()
//    breakLoop()
//    challenge1Main()
//    arrayMain()
    challenge2Main()
}


fun defVal(name: String = "User", age: Int ?= genRandInt()): String {
    return "Hello $name. Congrats on being $age"
}


fun prePost(num: Int): Int {
    /*
    demonstrates how pre increment and post increment works
     */
    println("Initiating function: ${::prePost.name}")

    println("Received Int: $num")

    var x: Int = num

    println("x++ Shows then adds: ${x++}")
    println("++x Adds then shows: ${++x}")

    println("x-- Shows then subtracts: ${x--}")
    println("--x Subtracts then shows: ${--x}")

    return x
}


fun operators(num1: Int, num2: Int? = null) {
    /*
    practicing operators
     */
    println("Initiating function: ${::operators.name}")

    var x = num1
    var y = num2 ?: genRandInt()

    if (x < y) {
        println("Need swapping")
        x = y.also { y = x }
    } else {
        println("As is")
    }

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x.toFloat() / y.toFloat()}")
    println("x % y = ${x % y}")
}


fun charBool() {
    println("Initiating function: ${::charBool.name}")

    //    explicit type definition is redundant
    val charVal: Char = 'i'
    val boolVal: Boolean = false

    println("Char name: $charVal\tBoolean Value: $boolVal")
}


fun checkInference() {
    /*
    print variable type
     */

    println("Initiating function: ${::checkInference.name}")

    val usrNum1 = 28   //  default inferred as Int if not explicit declared
    val usrNum2 = 28L   //  default inferred as Long
    val usrNum3 = 2.5
    val usrNum4 = 2.5f

    println("usrNum1 type: ${usrNum1::class.simpleName}\tusrNum2 type: ${usrNum2::class.simpleName}")
    println("usrNum3 type: ${usrNum3::class.simpleName}\tusrNum4 type: ${usrNum4::class.simpleName}")
}


fun printDataType() {
    /*
    call all data type functions and print
     */

    println("Initiating function: ${::printDataType.name}")

    val (minByte, maxByte) = returnByte()
    println("Min byte: $minByte\tMax byte: $maxByte")
    val (minNum, maxNum) = returnNum()
    println("Min Int num: $minNum\tMax Int num: $maxNum")
    val (minS, maxS) = returnShort()
    println("Min short: $minS\tMax short: $maxS")
    val (minL, maxL) = returnLong()
    println("Min Long: $minL\tMax Long: $maxL")
}


// gen a random num of 1 to lastNum if null then 20 (21 exclusive)
fun genRandInt(fstNum: Int = 1, lastNum: Int = 21): Int = if (fstNum > lastNum) Random.nextInt(lastNum, fstNum) else Random.nextInt(fstNum, lastNum)


fun ctrlFlow(): String {
    println("Initiating: ${::ctrlFlow.name} ")

    val randInt = genRandInt()

    val text: String = when {
        randInt == 5 || randInt == 10 -> "5 or 10"
        randInt == 15 || randInt == 20 -> "15 or 20"
        randInt in 6..9 -> "Between 6 and 9"
        else -> "Not blessed numbers"
    }

    return text
}


fun ctrlFlow2() {
    /*
    demonstrates when expression
     */
    println("Initiating: ${::ctrlFlow2.name}")

    println("Enter a num: ")
    var usrIn: String = readln()

    when {
        usrIn.isEmpty() -> println("Input is empty")
        usrIn.toIntOrNull() != null -> {
            println("$usrIn is int")
            if (usrIn.toInt() % 2 == 0) println("$usrIn is Even")
            else println("Int is Odd")
        }

        usrIn.toDoubleOrNull() != null -> println("$usrIn is double")
        else -> println("$usrIn is string")
    }
}


fun nullStr() {
    println("Initiating ${::nullStr.name}")
    // by default, var is not nullable so making nullable with ?
    var txt: String? = "iCode"
    txt = null
    // ? allows safe call to null var, returns null for null instead of pne
    println("${txt?.length}")
//    println(txt!!.length) // force a npe

    // elvis op -> if txt not null assign txt else assign "Some text"
    val txt2: String = txt ?: "Default since var null"
}