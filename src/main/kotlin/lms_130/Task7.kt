package lms_130

fun task7(items: List<Int>): Int {
 var result= if (items.isNotEmpty()) items.first() else 0
    items.forEach {number ->
if (number < result){
result= number
}
    }
    return result
}
fun main (){
    println(task7(items = listOf(10,5,11)))
}