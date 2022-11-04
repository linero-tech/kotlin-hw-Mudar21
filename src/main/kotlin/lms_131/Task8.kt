package lms_131

fun task8(grades: Map<String, List<Double>>): String {
    val averageMap = mutableMapOf<String, Double>()
    // Loop over the list of students
    grades.forEach { student, studentGrades ->
        // Add all the grades
        var totalSum = 0.0
        studentGrades.forEach { grade ->
            totalSum += grade
        }
        // Diviide the result by the number of grade
        val averageGrade = totalSum / studentGrades.size
        // Save the avg result in a map
        averageMap[student] = averageGrade
    }
    // Find ther student with the highest avg
    var highestGrade = averageMap.entries.first().value
    var result = averageMap.entries.first().key
    averageMap.forEach { student, grade ->
        if (grade > highestGrade) {
            highestGrade = grade
            result = student

        }
    }

    return result
}

fun main() {
    println(
        task8(
            grades = mapOf(
                "ana" to listOf(4.0, 4.5, 5.0),
                "John" to listOf(5.0, 5.0, 3.0),
                "lise" to listOf(2.0, 2.0, 2.0)
            )
        )
    )
}
