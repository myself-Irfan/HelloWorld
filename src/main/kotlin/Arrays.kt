fun arrayMain() {
    mixArr()
}


fun mixArr() {
    val mixArr: Array<Any> = arrayOf(1, 2, "Irfan", "Shafayet", 2.75) // mixed array
    var strCnt: Int = 0
    var intCnt: Int = 0

//    for (elem in mixArr) {
//        if (elem is String) strCnt++
//        else if (elem is Int) intCnt++
//        else println("Not Int/Str: $elem")
//    }

    mixArr.forEach {
        when (it) {
            is String -> strCnt++
            is Int -> intCnt++
            else -> println("Not Str/Int: $it")
        }
    }

    println("Size: ${mixArr.size}\tString count: $strCnt\tInt count: $intCnt")
}


fun bArr() {
    val names: Array<String> = arrayOf("Irfan", "Asif", "Towfique")
    println("Array size: ${names.size}")
    println("0th element: ${names[0]}")
    names.forEach { println("$it") }

    println("2nd element: ${names[2]}")
    names[2] = "Shafayet"
    println("2nd element: ${names[2]}")
}