package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    val isCoursePersisted : Boolean

    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Saving course: $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Name of the course 1", "Author of course 1")
    }

    override fun save(course: Course): Int {
        println("Not really doing anything. OVERRIDDEN! Flipping isCoursePersisted value")
        isCoursePersisted = !isCoursePersisted
        return -1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Name of the course 2", "Author of course 2")
    }
}

interface A {
    fun doSomething(){
        println("do something in A")
    }
}

interface B {
    fun doSomething(){
        println("do something in B")
    }
}

class AB : A,B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("Doing something in AB too")
    }

}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println(
        """Got the course:
        |Id : ${course.id}
        |Name : ${course.name}
        |Author : ${course.author}
    """.trimMargin()
    )
    println("Got course: $course")


    val nosqlCourseRepository = NoSqlCourseRepository()
    val course2 = nosqlCourseRepository.getById(87)
    println(
        """Got the course:
        |Id : ${course2.id}
        |Name : ${course2.name}
        |Author : ${course2.author}
    """.trimMargin()
    )
    println("Got course: $course2")


    val course3 = Course(61, "Some new name", "And a different author")
    val newCourseId : Int = nosqlCourseRepository.save(course3)
    println(newCourseId)
    println("Course persisted in noSql? ${nosqlCourseRepository.isCoursePersisted}")

    println("Course persisted? ${sqlCourseRepository.isCoursePersisted}")
    val anotherCourseId : Int = sqlCourseRepository.save(course3)
    println(anotherCourseId)
    println("Course persisted? ${sqlCourseRepository.isCoursePersisted}")

    val ab = AB()
    ab.doSomething()


}