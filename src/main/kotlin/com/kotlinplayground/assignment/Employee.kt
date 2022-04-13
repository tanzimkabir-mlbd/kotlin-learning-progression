package com.kotlinplayground.assignment

data class Employee(
    var name : String,
    val id : Int
){
    init {
        name = name.replace(" ", ".")
    }
}

fun main() {
    val newEmployee = Employee(id =  5, name =  "Tanzim Kabir")
    println(newEmployee)

    val anotherEmployee = Employee("Tanzim", 5)
    println("Comparing both employee objects: ${newEmployee == anotherEmployee}")

    val lastEmployee = newEmployee.copy(
        id = 2, name = "Kabir"
    )
    println("Newly created employee is $lastEmployee")
}