package com.kotlinplayground.classes

class Person(
    val name: String = "",
    val age: Int = 0
    ) {

    fun action() {
        println("Person walks")
    }
}

fun main() {
    val person = Person(age = 26, name = "Tanzim")
    person.action()
    println("Name: ${person.name} is of age ${person.age}")

    val person2 = Person()
    println("Name: ${person2.name} is of age ${person2.age}")

}