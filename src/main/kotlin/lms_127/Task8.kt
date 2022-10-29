package lms_127

fun task8(sentence: String, character: Char): Int {
    val result = sentence.count { it == character }
    println(result)
    return result
}
fun main (){
task8(sentence ="I code in KOTLIN", character = 'I')
}