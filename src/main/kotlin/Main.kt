fun main(args: Array<String>) {
//    explicit declaration is not mandatory since Kotlin has type inference
//    var curRealm: String = "NetherRealm"
//    val age: Int = 22
//
//    println("Hello from $curRealm, Mortal.\nYou died at $age")
//    printDataType()
//    checkInference()
//    floatDouble()
    charBool()
}

fun charBool() {
//    explicit type definition is redundant
    val charVal: Char = 'i'
    val boolVal: Boolean = true

    println("Char name: $charVal\tBoolean Value: $boolVal")
}

fun floatDouble() {
    val usrNum1 = 2.5f
    val usrNum2 = 2.5

    println("Function Name: ${::floatDouble.name}")
    println("usrNum1 type: ${usrNum1::class.simpleName}\tusrNum2 type: ${usrNum2::class.simpleName}")
}

fun checkInference() {
    val usrNum1 = 28   //  default inferred as Int if not explicit declared
    val usrNum2 = 28L   //  default inferred as Long

    println("Function Name: ${::checkInference.name}")
    println("usrNum1 type: ${usrNum1::class.simpleName}\tusrNum2 type: ${usrNum2::class.simpleName}")
}

fun printDataType() {
    println("Function Name: ${::printDataType.name}")

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
    val minByte: Byte = Byte.MIN_VALUE
    val maxByte: Byte = Byte.MAX_VALUE

    return Pair(minByte, maxByte)
}

fun returnNum(): Pair<Int, Int> {
    val minNum: Int = Int.MIN_VALUE
    val maxNum: Int = Int.MAX_VALUE

    return Pair(minNum, maxNum)
}

fun returnShort(): Pair<Short, Short> {
    val minShort: Short = Short.MIN_VALUE
    val maxShort: Short = Short.MAX_VALUE

    return Pair(minShort, maxShort)
}

fun returnLong(): Pair<Long, Long> {
    val minLong: Long = Long.MIN_VALUE
    val maxLong: Long = Long.MAX_VALUE

    return Pair(minLong, maxLong)
}