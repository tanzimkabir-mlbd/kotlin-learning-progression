package com.kotlinplayground.basics

fun main(){
    //if-else
    //when

    val name = "Tanzim"
    val result = if(name.length == 4){
        println("Name is Four Characters")
        name
    }else{
        println("Name is not four characters. Length is ${name.length}")
        name.length
    }

    println("result: $result")

    val position = 3

    var medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal)
}