package com.cv.learningkotlin.kotlin

fun main(args: Array<String>) {
    var name: String? = null

    //name = "Carlos"

    println(name?.toUpperCase()) //null safe operator

    // println(name!!.toUpperCase()) //non null assert operator (DON'T USE THIS)

    var address: String? = null //Nothing class

    address = "Hello"

    var myInteger : Int? = 7

    myInteger = null
}