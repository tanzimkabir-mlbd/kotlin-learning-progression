package com.kotlinplayground.classes

open class User(val name: String) {

    open var isNewUser : Boolean = true

    open fun login(){
        println("Inside login function")
    }
}

class Student(name: String) : User(name){

    override var isNewUser: Boolean = false

    companion object{
        val another_state : String = "Inactive"
        fun state(){
            println("Active")
        }
    }
    override fun login() {
        super.login()
        println("Inside student login function")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Tanzim")
    println("Student's name is ${student.name}")
    student.login()
    println("Student new status ${student.isNewUser}")
    Student.state()
    println("Name of the state in variable is ${Student.another_state}")

    val instructor = Instructor("Kabir")
    println("Instructor's name is ${instructor.name}")
    instructor.login()
    println("Instructor new status ${instructor.isNewUser}")

}