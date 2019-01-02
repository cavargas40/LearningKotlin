package com.cv.learningkotlin.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import java.util.*
import kotlin.test.assertEquals

class AgeCalculation {

    fun getAge(dateOfBirth: Calendar): Int {
        val today = Calendar.getInstance()
        val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)

        if(dateOfBirth.timeInMillis > today.timeInMillis) throw IllegalArgumentException()

        return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR))
            years - 1
        else
            years
    }
}

class AgeCalculationTest() {

    val ageCalcClass = AgeCalculation()

    @Test
    fun checkAgeWhenBornToday() {
        assertEquals(0, ageCalcClass.getAge(Calendar.getInstance()))
    }

    @Test
    fun checkAgeWhenBorn1000DaysAgo() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, -1000)

        assertEquals(2, ageCalcClass.getAge(date))
    }

    @Test
    fun testForException(){
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, 10)

        Assertions.assertThrows(java.lang.IllegalArgumentException::class.java){
            ageCalcClass.getAge(date)
        }
    }
}