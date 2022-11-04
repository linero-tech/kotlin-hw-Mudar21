package lms_131

fun task12(a: List<Int>, b: List<String>): Map<Int, String> {
    val result = mutableMapOf<Int, String>()
    a.forEachIndexed { index, number ->
        result[number] = b[index]
    }
    println(result)
    return result
}
fun main() {
    task12(a = listOf(1, 2, 3, 4), b = listOf("W", "X", "Y", "Z"))
}