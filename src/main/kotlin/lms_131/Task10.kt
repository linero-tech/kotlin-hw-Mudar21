package lms_131

fun task10(mapa: Map<Int, String>): Map<String, Int> {
    val result = mutableMapOf<String, Int>()
    mapa.forEach { (key, value) ->
        result[value] = key
    }
    println(result)
    return result
}

fun main() {
    task10(mapa = mapOf(1 to "A", 2 to "B", 3 to "C"))
}