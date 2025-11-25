package Main01

fun main(){

    val user1 = Usuario("Kaique")
    val user2 = Usuario("Roger")

    Usuario.resetCount()//resetou o contador, começando a contagem
    Usuario.count = 10 //tambem pode chama-lo diretamente e atribuir um valor

    val user3 = Usuario("Dyane")//aqui vai sair 11


}

class Usuario(var nome: String, var isAdmin: Boolean){

    //tudo que está aqui dentro pertece a classe
    companion object{
        var count = 0 //pertence a classe

        fun resetCount(){
            count = 0
        }
    }

    //var count = 0 //propriedade do obj

    init {
        count++ //adiciona sempre +1
        println(count)
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