package Main01

import java.lang.IllegalStateException

fun main(){
    val user1 = TestUser("kaique")

}

class TestUser(var nome: String, var isAdmin: Boolean){

    companion object{
        //const COMPILAÇÃO
        //val EXECUÇÃO
        const val MAX_NAME_LENGTH = 8
    }

    init {
    }

    constructor(nome: String) : this(nome,true){
        println("Execute o construtor 2")
    }

    constructor() : this ("Desconhecido"){
        println("Execute o construtor 3")
    }

    fun printName(){
        println("Meu nome é: $nome, é admin: $isAdmin")
    }
}