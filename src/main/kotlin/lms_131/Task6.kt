package lms_131

fun task6(mapa: Map<Int, String>, parameter: String): Map<Int, String> {
    val result = mutableMapOf<Int, String>()
    result += mapa.filterValues { it == parameter }

    return result
}
fun main() {
    println(task6(mapa = mapOf(20 to "Ana", 40 to "John", 22 to "Ana"), parameter = "Ana"))
}