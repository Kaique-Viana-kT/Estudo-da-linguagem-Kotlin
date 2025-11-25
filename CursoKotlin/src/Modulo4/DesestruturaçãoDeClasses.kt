package Modulo4

fun main(){
    val user1 = User2("KAIQUE","Aguiar" ,false)
    println(user1.component1())

    //desistruturação - quebra de dados
    val(nome, lastname, isAdmin) = user1
    println("meu nome é $nome $lastname e meu perfil é admin: $isAdmin")
}

// a ordem aqui é importante
data class User2(var nome: String, var lastName: String,var isAdmin: Boolean){
    fun description(): String = "meu nome é $nome"

    fun nameLenght(): Int = nome.length //forma inline
}