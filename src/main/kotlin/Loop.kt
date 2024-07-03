/*
This package demonstrates loops and varargs
vararg allows no fixed limit of same data type
 */

fun sumVarArg(vararg nums: Int): Int {
    var res = 0
    for (num in nums) {
        res += num
    }

    return res
}


fun sumVarArg2(vararg nums: Int): Int {
    var res = 0

    nums.forEach { res += it }

    return res
}


fun loopStrChar(txt: String) {
    txt.forEach {
        if (it != ' ') println("Cur Char: $it")
    }
}


fun forLoop() {
    // can only count upwards

    for (i in 1..10) println(".. Cur iteration: $i")                        // last inclusive
    for (i in 1 until 10) println("until Cur iteration: $i")                // last exclusive
    for (i in 1 until 10 step 2) println("until step 2 cur iteration: $i")  // 2 increment
    for (i in 10 downTo 1) println("downTo Cur iteration: $i")              // reverse
}


fun whileLoop(): Int {
    var num1 = 0
    var num2 = 0

//    while (num < 10) {
//        println(num)
//        num++
//    }

    while (num1 < 10) println(num1++) // prints then increments
    while (num2 < 10) println(++num2) // increments then prints

    return if (num1 == num2) num1 else 0
}


fun doWhile(){
    /*
    do while does the work then checks
     */

    var num = 10

    do {
        println(num)
    } while (num < 10)
}


fun lContinue() {
    /*
    demonstrates continue in a loop
     */

    for (i in 1..10) {
        if (i%2 == 0) continue  // continue skips the iteration
        else if (i == 7) break // breaks out of the loop
        else println("lCont: $i")
    }
}


fun breakLoop() {
    /*
    this demonstrates how break works, break -> init loop
     */
    var num1 = 0
    var num2 = 0

    while (num1 < 5) {
        num1++
        println("$num1")

        var i = 0

        while (i < 5) {
            if (i == 3) break
            i++
            println("#$i")
        }
    }

    /*
    this demonstrates how break with label works ->
     */
    init@ while (num2 < 5) {
        num2++
        println("$num2")

        var i = 0

        while (i < 5) {
            if (i == 3) break@init
            i++
            println("*$i")
        }
    }
}