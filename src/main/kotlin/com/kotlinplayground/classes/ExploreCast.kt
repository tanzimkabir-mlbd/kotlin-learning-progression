package com.kotlinplayground.classes


fun checkType(objectName : Any) {

    print("The type of the object is: ")
    when(objectName){
        is Course -> println("Course")
        is String -> println(objectName.lowercase())
    }
}

fun main(){

    val course1 = Course(1, "Name of course", "Author of course")

    checkType(course1)
    checkType("Something")

    println(course1 as Any)
    val number : Int = 8
    println(number.toFloat())
}