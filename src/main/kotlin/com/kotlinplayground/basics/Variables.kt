package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {


    val name = "Tanzim"

    println(name)

    //name = "Tanzim 2"

    var age = 26
    println(age)
    age = 27
    println(age)

    var salary = 30000L
    println(salary)

    var course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiline = "ABC \n DEF"
    println(multiline)

    val multiline1 = """
        ABC
        DEF
    """.trimIndent()

    println(multiline1)

    println("Calling toplevel function : ${topLevelFunction()}")
    println("Course name is : $courseName")
}