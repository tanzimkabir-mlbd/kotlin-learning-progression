package com.kotlinplayground.functions

import java.time.LocalDate

fun main() {
    /*
    printName("Tanzim")
    val result = addition(5,7)
    println("Result is $result")
    val result2  = addition_approach2(9,3)

     */
    printPersonDetails("Tanzim", "tanzimkabir29", LocalDate.parse("1996-01-15"))
    printPersonDetails("Tanzim")
    printPersonDetails(dob =  LocalDate.now(), email = "Random stuff", name =  "Tanzim2222")
}

fun addition(x: Int, y: Int): Int {
    return x+y
}

fun addition_approach2(x : Int, y : Int) = x+y

fun printName(name : String) : Unit {
    println("Name is : $name")
}

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
){
    printName("Name is $name, email is $email and date of birth is $dob")
}
