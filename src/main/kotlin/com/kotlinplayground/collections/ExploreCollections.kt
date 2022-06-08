package com.kotlinplayground.collections

fun main(){

    val stuff = listOf(1, "Tanzim")

    println(stuff)

    val changeableStuff = mutableListOf("Same", "As", "Java")
    changeableStuff.add("LOL")
    println(changeableStuff)
    changeableStuff.remove("Same")
    println(changeableStuff)

    val fixedSet = setOf(1,2,3,4)
    println("Just made of a set of size ${fixedSet.size} with elements $fixedSet")

    val flexSet = mutableSetOf(1,2,3)
    println("Set is initially: $flexSet")
    flexSet.add(5)
    println("Set now has 1 more element: $flexSet")
    flexSet.remove(2)
    println("Set now has 1 less element: $flexSet")

    val fixedMap = mapOf(1 to "One", 2 to "Two", 58 to "Fifty eight")
    println("The immutable map \"fixedMap\" cannot be changed: $fixedMap")
    val flexMap = mutableMapOf(3 to "Three", 9 to "Nine")
    println("Flexmap is initially: $flexMap")
    flexMap[9] = "Nono"
    println("Changed flexmap values: $flexMap")
    flexMap[99] = "Ninety nine"
    println("Changed flexmap values again: $flexMap")
}