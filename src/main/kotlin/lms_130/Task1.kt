package lms_130

fun task1(items: List<Int>): Int {
var result=0
    if (items.isNotEmpty()){
        result+=items.random()
    }
    else{
        result=0
    }
    return result
}
fun main(){
    println(task1(items = listOf()))
}