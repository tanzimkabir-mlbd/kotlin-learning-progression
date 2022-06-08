package com.kotlinplayground.collections

import com.kotlinplayground.dataset.*
import kotlin.reflect.typeOf

fun main() {
    val courseList = courseList()

    val devPredicate = {c : Course -> c.category == CourseCategory.DEVELOPMENT}
    val businessPredicate = {c : Course -> c.category == CourseCategory.BUSINESS}

    val nestedList = listOf(listOf('a','b','c','d'), listOf('e','f','g','h'))

    val resultList1 = nestedList.map { it.map { it.uppercaseChar() } }
//    println(resultList1)

    val resultList2 = nestedList.flatMap { it.map { it.uppercaseChar() } }
//    println(resultList2)

//    exploreFilter(courseList, devPredicate)
//    exploreFilter(courseList, businessPredicate)

//    exploreMap(courseList, devPredicate)

    val flattenedMap = exploreFlatMap(courseList, SPRING_BOOT)
//    println(flattenedMap)

    exploreHashMap()
}

fun exploreHashMap() {

    val numberMap = mutableMapOf(1 to "One", 2 to "Two", 10 to "Ten", 15 to "Fifteen", 19 to "Nineteen")
    numberMap
        .forEach{
            println("Value of ${it.key} is ${it.value}")
        }

    val value1 = numberMap.getOrDefault(3, "Not found")
    println(value1)

    val value2 = numberMap.getOrElse(3) {
        val x = 1+1
        "No value for the key was found but I calculated $x"
    }
    println(value2)

    println("""
        Does numberMap contain 1? Answer: ${numberMap.containsKey(1)}
        Does numberMap contain 5? Answer: ${numberMap.containsKey(5)}
    """.trimIndent())
}

fun exploreFlatMap(courseList: MutableList<Course>, topicCheck: String) : List<Any>{

    return courseList.flatMap {
        val requiredCourses = it.name
        it.topicsCovered.filter {
            it == topicCheck
        }.map {
            requiredCourses
        }
    }


}

fun exploreMap(courseList: MutableList<Course>, devPredicate: (Course) -> Boolean) {
    val courseNames = courseList
        .filter(devPredicate)
        .map { "${it.name} - ${it.category}" }
        .forEach {
            println(it)
        }
}

fun exploreFilter(courseList: MutableList<Course>, pred : (Course) -> Boolean) {
    courseList
//        .filter { it.category == CourseCategory.DEVELOPMENT }
        .filter { pred.invoke(it) }
        .forEach{
            println("$it")
        }
}
