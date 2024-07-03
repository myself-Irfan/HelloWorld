fun challengeMain () {
    /*
    main for challenge1
     */

    var num = 1
    val lastNum = genLastNum()

    var evnCnt = 0
    var oddLi = mutableListOf<Int>()

    for (i in num..lastNum) {
        if (isEven(i)) {
            evnCnt++
            continue
        }
        else oddLi.add(i)
    }

    println("Total Even num: $evnCnt\tAll Odd num: $oddLi")
}


// return True for even
fun isEven(num: Int): Boolean = (num%2) == 0


fun genLastNum (): Int {
    var lastNum: Int

    do {
        lastNum = genRandInt(40)
        println("Generated last num: $lastNum")
    }
    while (lastNum < 10)

    return lastNum
}
