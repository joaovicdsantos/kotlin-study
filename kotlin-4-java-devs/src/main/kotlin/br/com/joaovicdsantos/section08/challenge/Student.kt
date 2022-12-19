package br.com.joaovicdsantos.section08.challenge

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ada", 19),
        Student("Manoel", 23),
        Student("Maria", 20),
        Student("João", 19),
        Student("José", 16)
    )
}