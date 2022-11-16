package lms_132

fun task3(sentence: String?): String {
    val vowels = "aeiou"
    var result = ""
    if (sentence != null) {
        for (letter in sentence) {
            if (vowels.contains(letter,ignoreCase = true)) {
                result += "*"
            } else {
                result += letter
            }
        }

    }
    println(result)
    return result
}

fun main() {
    task3(sentence = "I live in SwEdEn")
}