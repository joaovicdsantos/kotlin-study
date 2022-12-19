package br.com.joaovicdsantos.section05._0502

//class Person constructor (firstName: String, lastName: String) { // constructor só é necessário se houver alguma anotação ou coisa do tipo
// class Person (firstName: String, lastName: String) {
class Person internal constructor (firstName: String, lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName)

}