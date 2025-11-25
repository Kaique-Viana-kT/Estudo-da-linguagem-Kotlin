package Modulo4

fun main(){
    val animal1 = Ave("Pica-pau", "ave")
    animal1.descricao()
    val animal2 = Mamifero("cachorro", "mamifero")
    animal2.descricao()
}

open class Animal(var nome: String, var type: String){
    fun descricao(){
        println("O animal $nome é do tipo $type")
    }
}

class Ave(nome: String, type: String) : Animal(nome,type)

class Mamifero(nome: String, type: String) : Animal(nome,type)

