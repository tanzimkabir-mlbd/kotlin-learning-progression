package com.kotlinplayground.classes


// class Any is the superclass of all objects, like Object() in Java
object Authenticate : Any() {

    fun authenticate(username: String, password: String) {
        println("User: $username authenticated with password $password")
    }
}

fun main() {

    Authenticate.authenticate("Tanzim", "Kabir")

}