package com.cv.learningkotlin.kotlin

class Customer(
    val name: String,
    val address: String,
    var age: Int
)

fun main(args: Array<String>) {
    //instantiating a class
    val customer = Customer("Carlos", "Street 123", 25)
    customer.age = 27
    //accessing attributes
    println("${customer.name} is ${customer.age} years old")
}