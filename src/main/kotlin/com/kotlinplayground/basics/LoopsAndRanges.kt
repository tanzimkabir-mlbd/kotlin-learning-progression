package com.kotlinplayground.basics

import com.sun.jdi.Value

fun main() {

    val range = 1 .. 10
    for (i in range){
        println("i : $i")
    }

    val reverseRange = 10 downTo 1
    for (i in reverseRange){
        println("reverseRange : $i")
    }
    for (i in reverseRange step 2){
        println("reverseRange : $i")
    }
    explorewhile()

}

fun explorewhile() {
    var x = 1
    while(x < 5){
        println("Value of x is : ${++x}")
    }
}
