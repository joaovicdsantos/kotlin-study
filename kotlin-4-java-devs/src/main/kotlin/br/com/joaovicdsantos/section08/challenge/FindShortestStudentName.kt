package br.com.joaovicdsantos.section08.challenge

fun findTheShortestStudentName(students: List<Student>) = students.minByOrNull { it.name.length }