package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main(){

    val sequenceNames = listOf("abc","defg","hijklmn")
        .asSequence()
        .filter { it.length >=4 }
        .map { it.uppercase() }
        .toSet()

    println("Processing names a sequence: $sequenceNames")
    val pred = {c:Course -> c.category == CourseCategory.DEVELOPMENT}
    exploreFilterUsingSequences(courseList(),pred)

    val range = 1 .. 1000_000_000
    range
//        .asSequence()
        .map { it.toDouble() }
        .take(1000)
        .forEach{
            println("Value is: $it")
        }
}

fun exploreFilterUsingSequences(courseList: MutableList<Course>, pred : (Course) -> Boolean) {
    courseList
//        .filter { it.category == CourseCategory.DEVELOPMENT }
        .asSequence()
        .filter { pred.invoke(it) }
        .forEach{
            println("$it")
        }
}