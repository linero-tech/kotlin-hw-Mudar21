package lms_131

fun task5(mapa: Map<Int, Int>, constant: Int): List<Int> {
    val result = mutableListOf<Int>()
    mapa.forEach { (key, value) ->
        if (value !== constant) {
            result += key
        }
    }
    return result
}

fun main() {
    println(task5(mapa = mapOf(1 to 100, 3 to 200, 4 to 500), constant = 200))
}