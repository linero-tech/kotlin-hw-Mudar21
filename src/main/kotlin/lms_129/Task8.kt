package lms_129

fun task8(number: Int): Int {
var result=0
    val nmbrSum = number.toString().toList()
    nmbrSum.forEach { result += it.toString().toInt() }
    return result
}
fun main (){
    println(task8(number = 123))
}