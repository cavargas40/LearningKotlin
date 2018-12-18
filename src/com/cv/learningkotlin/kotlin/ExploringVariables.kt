package com.cv.learningkotlin.kotlin

fun main(args: Array<String>) {
    strings()
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



