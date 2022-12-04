package lms_133

fun groceries(list: List<Map<String, Any>>): Double {
    var result = 0.0
    list.forEach { map ->
        result += map.getValue("quantity").toString().toInt() * map.getValue("price").toString().toDouble()
    }

    return result
}

fun main() {
    println(
        groceries(
            list = listOf(
                mapOf("product" to "Milk", "quantity" to 3, "price" to 1.50),
                mapOf("product" to "Meat", "quantity" to 3, "price" to 2.50)
            )
        )
    )
}