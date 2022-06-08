package com.kotlinplayground.collections

// Higher order function - functions that accept functions
fun calculate(x: Int, y: Int, lambdaa: (Int, Int) -> Int) : Int {
    return lambdaa(x,y)
}

fun main(){

    val squareFunc = {x : Int -> x*x}

    println(squareFunc(5))

    val multi = {x: Int, y: Int -> x*y}

    val product = calculate(2,3, multi)
    println("Product of numbers is $product")

    // Can also use this syntax
    val product2 = calculate(2,7) {x: Int, y: Int -> x*y}
    println("Product of numbers is $product2")

}