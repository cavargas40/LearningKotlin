package com.cv.learningkotlin.kotlin

//data classes
data class Customer(
    val name: String,
    val address: String,
    var age: Int
) {

    //constructor(name: String, age: Int) : this(name, "", age)
    //second constructor must call the first constructor
    constructor(name: String, age: Int) : this(name, "", age) {
        println("secondary constructor")
    }

    //with this syntax if you wanna access to the first constructor you have to use the init
    init {
        println("init block")
    }
}

class AlternativeCustomer(val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

class AnotherAlternativeCustomer(val name: String, val address: String = "", var age: Int) {
    var approved: Boolean = false
        //overriding setter
        set(value) {
            if (age >= 21) {
                field = value
            } else {
                println("You can't approve a customer under 21 years old.")
            }
        }

    //getter
    val nextAge
        get() = age + 1

    //this is how destructuring in data class
    operator fun component1() = name
    operator fun component2() = age

    //function within a class
    fun uppercaseName() =
        name.toUpperCase()

    //override functions
    override fun toString() =
        "$name $address $age"

    //all functions inside companion object are static functions
    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Azusa", age = 25)
    }
}

fun main(args: Array<String>) {
    //instantiating a class
    val customer = AnotherAlternativeCustomer("Carlos", "Street 123", 25)
    customer.age = 27
    customer.approved = true
    //accessing attributes
    val customer2 = AnotherAlternativeCustomer("Andres", age = 3)
    customer2.approved = true
    println("${customer.name} is ${customer.age} years old and is ${customer.approved}")
    println("${customer2.name} is ${customer2.age} years old and is ${customer2.approved}")
    println("next year ${customer2.uppercaseName()} will be ${customer2.nextAge}")
    println(customer2.toString())

    val customer3 = AnotherAlternativeCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Susana", 25)
    println(customer4)

    //if the class is type data you can copy and replace the data
    val customer5 = customer4.copy(name = "Susanita")
    println(customer5)

    //if the class is data you can destructuring
    val (name, age, address) = customer5
    println(name)

    val (name2, age2) = customer
}