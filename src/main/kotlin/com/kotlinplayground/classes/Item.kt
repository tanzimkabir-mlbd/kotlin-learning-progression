package com.kotlinplayground.classes

import java.lang.IllegalArgumentException

class Item() {
    var name : String = ""
    var price : Double = 0.0
    get(){
        println("Custom getter text print")
        return field
    }
    set(value) {
        if (value >- 0.0){
            field = value
        } else {
            throw IllegalArgumentException("Negative values not allowed")
        }
    }

    constructor(_name : String): this(){
        name = _name
    }
}

fun main() {
    var item = Item("Vase")
    println("I have created an item with name ${item.name}")

    item.price = 5.1
    println(item.price)
    item.price = -0.4
    println(item.price)
}