fun challenge2Main() {
    var randLi = genRandLi()
    var maxInt = getMax(randLi)
    var max2Int = get2Max(randLi, maxInt)
    var minInt = getMin(randLi)
    var min2Int = get2Min(randLi, minInt)

    println("iChallenge\ngenerated random list: ${randLi.contentToString()}\nFound maxInt: $maxInt\nFound maxInt2: $max2Int\nFound minInt: $minInt\nFound minInt2: $min2Int")

    val boolRes = getMinMax(randLi, false)
    println("getMinMax: $boolRes")
}


fun getMinMax(numLi: Array<Int>, searchMax: Boolean = true): Int = if (searchMax) getMax(numLi) else getMin(numLi)


fun get2Min(numLi: Array<Int>, min: Int): Int {
    var min2: Int = Int.MAX_VALUE

    for (num in numLi) if (num > min && num < min2) min2 = num

    return min2
}


fun getMin(numLi: Array<Int>): Int {
    var min: Int = numLi[0]

    for (num in numLi) if (num < min) min = num

    return min
}


fun get2Max(numLi: Array<Int>, max: Int): Int {
    var max2: Int = Int.MIN_VALUE

    for (num in numLi){
        if (num > max2 && num < max)
            max2 = num
    }

    return max2
}


fun getMax(numLi: Array<Int>): Int {
    var max: Int = numLi[0]

    for (num in numLi){
        if (num > max) max = num
    }

    return max
}


fun genRandLi(): Array<Int> {
    val arrSize = genRandInt(lastNum = 6)
    val numArr: Array<Int> = Array(arrSize) { genRandInt() }

    return numArr
}
