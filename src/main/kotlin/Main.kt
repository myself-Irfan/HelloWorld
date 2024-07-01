import kotlin.random.Random


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


fun operators(num1: Int, num2: Int) {
    /*
    practicing operators
     */
    println("Initiating function: ${::operators.name}")

    var x = num1
    var y = num2

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


fun returnByte(): Pair<Byte, Byte> {
    /*
    return a pair of minimum and maximum of Byte data type
     */

    val minByte: Byte = Byte.MIN_VALUE
    val maxByte: Byte = Byte.MAX_VALUE

    return Pair(minByte, maxByte)
}


fun returnNum(): Pair<Int, Int> {
    /*
    return a pair of minimum and maximum of Int data type
     */

    val minNum: Int = Int.MIN_VALUE
    val maxNum: Int = Int.MAX_VALUE

    return Pair(minNum, maxNum)
}


fun returnShort(): Pair<Short, Short> {
    /*
    return a pair of minimum and maximum of Short data Type
     */

    val minShort: Short = Short.MIN_VALUE
    val maxShort: Short = Short.MAX_VALUE

    return Pair(minShort, maxShort)
}


fun returnLong(): Pair<Long, Long> {
    /*
    return a pair of minimum and maximum of Long data type
     */

    val minLong: Long = Long.MIN_VALUE
    val maxLong: Long = Long.MAX_VALUE

    return Pair(minLong, maxLong)
}


fun genRandInt(): Int {
    /*
    generate random Int
     */
    return Random.nextInt(1, 21)
}

fun main() {
//    explicit declaration is not mandatory since Kotlin has type inference
//    var curRealm: String = "NetherRealm"
//    val age: Int = 22
//
//    println("Hello from $curRealm, Mortal.\nYou died at $age")
//    checkInference()
//    charBool()
//

    val isActive: Boolean = true
    var ranNum: Int = genRandInt()
    val randInt1: Int = genRandInt()
    val randInt2: Int = genRandInt()
    println("Generated Int: $ranNum")

    if (isActive) {
        if (ranNum >= 10) {
            operators(randInt1, randInt2)
        } else if (ranNum > 0) {
            val resPrePost = prePost(ranNum)
            println("pre_Post result: $resPrePost")
        } else {
            println("$ranNum can not be less than 0")
        }
    } else {
        printDataType()
    }

    /*
     type definition since all return same data type else can not define type
     since only one instruction per block no curly braces but for more needs curly braces
     */

    val condText: String =
        if ((randInt1 % 2) == 0 && (randInt2 % 2 == 0)) "Generated $randInt1 $ $randInt2 are both Even"
        else if ((randInt1 % 2) == 0 || (randInt2 % 2) == 0) "Generated $randInt1 or $randInt2 is Odd"
        else "Generated $randInt1 and $randInt2 are both odd"

    println("Conditional Text: $condText")

}