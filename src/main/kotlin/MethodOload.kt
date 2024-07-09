/*
This package demonstrates method overloading
 */

fun methodOload() {
    println("getMax result: ${getMax()}")
    println("getMax result ${getMax(2.5, 3.75)}")
    println("getMax result: ${getMax(3,3,2)}")
}

fun getMax(num1: Int? = null, num2: Int? = null): Int {
    /*
    If null then generate a random Int
     */

    val n1 = num1 ?: genRandInt()
    val n2 = num2 ?: genRandInt()

    return if (n1 > n2) n1 else n2
}


fun getMax(num1: Double, num2: Double): Double {
    return if (num1 > num2) num1 else num2
}


fun getMax(num1: Int, num2: Int, num3: Int): Int {
    if (num1 > num2 && num1 > num3) return num1
    else if (num2 > num1 && num2 > num3) return num2
    else if (num3 > num1 && num3 > num2) return num3
    else return 0
}
