package com.kotlinplayground.basics

fun main() {
    for (i in 1 .. 5){
        println("i in $i")
        if(i == 3) break
    }

    label()

    return

    println("End of the Program!")
}

fun label() {
    loop@
    for (i in 1 .. 5){
        println("i in label $i")
//        if(i == 3) break@loop
        innerloop@ for (j in 1 .. 5){
            println("j in label $j")
            if (j==2) break@loop
        }
    }

}
