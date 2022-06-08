package com.kotlinplayground.nulls

import java.sql.Time
import java.time.DateTimeException
import java.time.Instant
import kotlin.random.Random
import kotlin.random.nextInt

data class Movie(
    var id : Int?,
    val name : String
)


fun main(){
    var nalabel : String? = null
    println("Value of nalabel: $nalabel")
    println("Length of nalabel: ${nalabel?.length}") // using safe call operator ?
    nalabel = "Sevennn"
    println("Now length is ${nalabel.length}") // Dont need safe call here since value already assigned
    nalabel = maybeNullMaybeNot()
    println("Nalabel value is not known. Length is ${nalabel?.length?.toLong() ?: "Null length"}")

    var iter : Int = 200

    while (iter > 0){
        println(maybeNullMaybeNot()!!)
        iter++
    }

    nalabel = "'This isn't null anymore he he'"
    println("Value of nalabel: $nalabel")

    println(nalabel::class)

    val movie = Movie(null, "Life of a Sigma")
    val savedMovie = saveMovie(movie)
    println(savedMovie)
}

fun maybeNullMaybeNot(): String? {
    val randomNumberGen = Random(System.currentTimeMillis())
    val someNumber = randomNumberGen.nextInt(0 ..1)
    return when(someNumber){
//        0 -> null
        1 -> "Not null"
        else -> null
    }
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id =  1)
}
