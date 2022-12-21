package lms_131

fun task9(grades: Map<String, List<Double>>): Double {
    var result = 0.0
    var summedGrades = 0.0
    var sizeCounter = 0
    grades.forEach { (_, studentGrades) ->
        studentGrades.forEach { grade ->
            summedGrades += grade
            sizeCounter++
        }
        result = summedGrades / sizeCounter
    }
    return result
}
fun main() {
    println(
        task9(
            grades = mapOf(
                "Ana" to listOf(4.0, 4.5, 5.0),
                "John" to listOf(5.0, 5.0, 3.0),
                "Lise" to listOf(5.0, 5.0, 5.0)
            )
        )
    )
}