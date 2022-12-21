package lms_131

fun task3(a: Map<Int, String>, b: Map<Int, String>): List<Int> {

    val result = mutableListOf<Int>()
    val aKeys = a.keys
    val bKeys = b.keys

    aKeys.forEach {key ->
        if (key in bKeys) {
            result.add(key)
        }
    }

    return result.toList()
}