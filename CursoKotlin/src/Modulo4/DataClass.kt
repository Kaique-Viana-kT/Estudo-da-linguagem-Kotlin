package Modulo4

fun main(){
    val user1 = User1("KAIQUE", false)
    val user2 = User1("KAIQUE", false)

    println(user1)
    println(user2)
    user1.description()
    println(user1.nameLenght())

    println(user1 == user2)
}

data class User1(var nome: String, var isAdmin: Boolean) {
    fun description(): String = "meu nome é $nome"

    fun nameLenght(): Int = nome.length //forma inline
}

