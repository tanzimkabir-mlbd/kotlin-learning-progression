package com.kotlinplayground.exceptions

fun main() {
    println("Length of string is ${nameLength("Tanzim")}")
    println("Length of string is ${nameLength(null)}")
    returnNothing()
}

fun nameLength(name: String?): Int? {
    return try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is : $ex")
        null
    }
}

fun returnNothing(): Nothing{
    throw RuntimeException("Ball is thrown")
}