package lms_133


fun counter(word: String): Boolean {
    val alphabets = ('a'..'z').toList()
    var sum = 0
    for (letter in word.lowercase()) if (letter in alphabets) sum += alphabets.indexOf(letter) + 1
    return (sum % 2 == 0)
}

fun main() {
    println(counter("ba"))
}