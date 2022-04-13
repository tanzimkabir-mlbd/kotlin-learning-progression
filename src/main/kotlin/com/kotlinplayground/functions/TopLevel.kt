package com.kotlinplayground.functions

const val courseName = "Kotlin Programming"

fun main() {
    val num = topLevelFunction()
    println(num)
}

fun topLevelFunction(): Int{
    return (0 .. 100).random()
}