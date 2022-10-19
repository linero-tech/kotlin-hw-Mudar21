package lms_130

fun task5(items: List<Int>): List<Int> {
    var result= mutableListOf<Int>()
for(index in items.indices){
    var number = index * items[index]
    result.add(number)
}
    return result
}
fun main(){
   println( task5(items = listOf(1,5,11)))
}