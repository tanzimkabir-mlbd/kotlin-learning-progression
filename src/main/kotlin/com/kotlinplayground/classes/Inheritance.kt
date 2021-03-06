package com.kotlinplayground.classes

open class User(val name: String) {

    open var isNewUser : Boolean = true

    protected var someNumber : Int = 0
    get() = field+1

    open fun login(){
        println("Inside login function")
    }

    private fun secret(){
        println("Inside secret function")
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

    fun changeSomeNumber(){
        println(someNumber)
        someNumber += 15
        println(someNumber)
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

    student.changeSomeNumber()
    val user = User("String initializer")
}