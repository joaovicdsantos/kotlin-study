package br.com.joaovicdsantos.section04

class KotlinTypes {

    /*

    Val -> Declara variáveis imutáveis (Recomendado, e deve ser usado sempre que possível)
    Var -> Declara variáveis mutáveis

    Benefícios da imutalidade:
        - Objetos imutáveis são thread-safe;
        - Dados imutáveis facilitam o parelelismo;
        - Referências à objetos imutáveis podem ser armazenada em cache;
        - Menos peças "soltas", mais fácil de entender.

    Alguns frameworks do javam requerem o uso de var (exemplo: JPA)
    */

    fun main() {

        // Tipo inferido
        val myPhrase = "I'm a String"
        val myPi = 3.14
        val myAnswer = 42

        // Precisa-se definir o tipo quando o valor não for definido na inicialização
        val aString: String
        val aDouble: Double
        val anInt: Int

        val myDouble = 1.999
        val myFloat = 1.9F
        val myLong = 219387382917L
        val myInt = 19
        val myShort: Short = 120
        val myByte: Byte = 127

        val aLongNumber = 123_456_789
        val theSameLongNumber = 123_456_789

        val anInt2: Int = 7
        val aLong: Long = anInt2.toLong()

    }

}