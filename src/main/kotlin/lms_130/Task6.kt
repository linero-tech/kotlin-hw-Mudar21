package lms_130

fun task6(sentence: String): String {
    var result=""
    sentence.forEachIndexed{index , letter ->
        result += if (index % 2 == 0){ letter.uppercaseChar() }
        else{ letter } }
    return result
}
fun main(){
    println( task6(sentence = "I like Gothenburg"))
}
