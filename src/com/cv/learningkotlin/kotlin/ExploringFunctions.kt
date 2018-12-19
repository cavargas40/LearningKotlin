package com.cv.learningkotlin.kotlin

//top level functions (public, static) by default
fun printAString(value: Any) =
    println(value)

//Single expression function
fun addTwoNumbers(one: Double = 6.2, two: Double = 3.9): Double =
    one + two

fun printSomeMaths(one: Double, two: Double){
    //one = 1  //this is not possible because the attributes are always immutable
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    fun functionWithInAFunction(a: String){
        println(a)
    }

    functionWithInAFunction("Hello") //is Valid but only exist in the parent function
}

//function with a lambda parameter
fun methodTakesLamba(input: String, action: (String) -> Int){
    println(action(input))
}

fun main(args: Array<String>) {
    printAString(addTwoNumbers(2.2, 5.3))
    addTwoNumbers(two = 5.6)
    printSomeMaths(two = 17.3, one = 9.6) //change the params order and util for functions with several parameters
}

