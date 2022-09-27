package lms_129

fun task2(number: Int): Boolean {
var result= false
    if (number % 2 == 1) result=true
    else if (number == 2) result=true
    println(result)
    return result
}
fun main(){
    task2(number = 25)
}