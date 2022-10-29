package lms_130

import lms_131.task12

fun task12_1(sells: List<Int>): String {

    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSellValue = sells.maxOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSellValue)
    val result = days[indexOfMaxSellValue]
    return result
}

fun task12_2(sells: List<Int>): String {
    
    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSetlValue = sells.minOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSetlValue)
    val result = days[indexOfMaxSellValue]
    return result
}

fun main() {
    println(task12_1(sells = listOf(20, 100, 800, 768, 765, 90, 10)))
    println(task12_2(sells= listOf(20, 100, 800, 768, 765, 90, 10)))
}