package com.cv.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    doubles()
}

fun strings() {
    var name: String = "Carlos"
    val surname = "Vargas"

    name = "Andres"
    //surname = "Lopez" //not valid for the val

    println("$name ${surname.toUpperCase()}") //template literals
    println("Your first name has ${name.length} characters")
    println("Your product cost \$about10")

    //multiple lines string
    val story = """It was a dark and stormy night.
        |A foul smell crept across the city.
        |Jane wondered what time it was, and when it would be daylight.""".trimMargin("|")

    println(story)

    val changedStory = story.replaceAfterLast("it", " would be dawn")

    println(changedStory)
}


fun doubles() {
    val myDouble = 21.4

    println("is myDouble a Double? ${myDouble is Double}")
    println("myDouble is a ${myDouble::class.qualifiedName}")

    println("myDouble's javaClass is ${myDouble.javaClass}")

    var myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}")

    val anotherInteger: Int = 17  //Int, not integer!!!!

    var myFloat: Float = 13.6f

    val result = myFloat + anotherInteger
    print(result)

    //BigDecimal bd = new BigDecimal(17)
    val bd : BigDecimal = BigDecimal(17)
    val bd2 : BigDecimal

    println("Hello")
    // bd2.abs() must be initialized

    bd2 = bd.add(BigDecimal(30))


}

