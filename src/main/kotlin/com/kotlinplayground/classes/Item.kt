package com.kotlinplayground.classes

class Item() {
    var name : String = ""
    constructor(_name : String): this(){
        name = _name
    }
}

fun main() {
    var item = Item("Vase")
    println("I have created an item with name ${item.name}")
}