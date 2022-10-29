package lms_130

import lms_131.task12

fun task12_1(sells: List<Int>): String {

    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSellValue = sells.maxOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSellValue)
    val result = days[indexOfMaxSellValue]

    println(result)

    return result
}

fun task12_2(sells: List<Int>): String {

    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSetlValue = sells.minOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSetlValue)
    val result = days[indexOfMaxSellValue]

    println(result)

    return result
}

fun task12_3(sells: List<Int>): Int {

    var result = 0
    sells.forEach {
        result += it
    }

    println(result)

    return result
}