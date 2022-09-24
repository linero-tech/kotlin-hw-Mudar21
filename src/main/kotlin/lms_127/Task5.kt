package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
var a= valueForA
    var b= valueForB
    a=b.also { b=a }
    println("value for a is $a")
    println("value for b is $b")

    // Do not erase or change this statement
    return Pair(a, b)
}
fun main(){
    task5(valueForA = 1 , valueForB = 2)
}