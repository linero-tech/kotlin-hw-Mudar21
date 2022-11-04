package lms_129

fun task2(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    var result = true
    for (digit in 2 until number) {
        if (number % digit == 0) {
            result = false
        }
    }
    return result
}

fun main() {
    println(task2(number = 4))
}