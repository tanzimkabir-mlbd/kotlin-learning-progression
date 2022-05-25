package com.kotlinplayground.classes

data class Course (
    val id : Int,
    val name : String,
    val author : String,
    val category: Category = Category.DEVELOPMENT
)

enum class Category{
    DEVELOPMENT,
    DESIGN,
    BUSINESS,
    MARKETING
}

fun main(){

    val course1 = Course(1, "First Name", "First Author of Course")
    println(course1)

    val course2 = Course(2, "Second Name", author = "Second Author", category = Category.DESIGN)
    println(course2)
}

