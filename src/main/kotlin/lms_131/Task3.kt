package lms_131

fun task3(a: Map<Int, String>, b: Map<Int, String>): List<Int> {

    val result = mutableListOf<Int>()
    val listAKeys = a.keys
    val listBKeys = b.keys

    listAKeys.forEach {key ->
        if (key in listBKeys) {
            result.add(key)
        }
    }

    return result.toList()
}