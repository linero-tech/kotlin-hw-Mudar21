package lms_130

fun task13_1(customers: List<String>): List<String> {
    println(customers)
    return customers.distinct()
}
fun task13_2(customers: List<String>): List<String> {
    val once = mutableListOf<String>()
    val moreThanOnce = mutableListOf<String>()
    customers.forEach() { customer ->
        if (customer !in once) once.add(customer)
        else (moreThanOnce.add(customer))
    }
    return moreThanOnce.distinct()
}
fun task13_3(customers: List<String>): List<String> {
    val result = mutableListOf<String>()
    customers.forEach() { email ->
        val (username, domain) = email.split("@")
        result += domain.substringBefore(".")
    }
    return result.distinct()
}

fun main() {
    val listOfCustomer = listOf(
        "tgundrey1l@prlog.org",
        "bgrix1u@apache.org",
        "mbreakspear1v@wordpress.com",
        "cdalli1w@ft.com",
        "rclayborn1x@mtv.com",
        "rclayborn1x@mtv.com",
        "jchidlow1y@nasa.gov",
        "jchidlow1y@nasa.gov",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com"
    )

    println("The customers who purchased from your product: ${task13_1(listOfCustomer)}")
    println("The customers that purchased multiple times include: ${task13_2(listOfCustomer)}")
    println("The companies that purchased from you include: ${task13_3(listOfCustomer)}")
}
