package Modulo4

fun main(){

    val p = Profesor("Girafales", "Rua A")
    println(p.descricao())
    val a = Aluno(1234, "Triago", "Rua B")
    println(a.matriculaId)
    println(a.descricao())


}

//heranca -> objX é objY (herda as prop. Y)

//super class - class que voce herda as prop.
open class Pessoa(var name: String, var address: String){
    //se voce mudar a classe pai, voce muda a filha
    fun descricao() = "Meu nome é $name e meu endereço é: $address"
}

class Profesor(name: String, address: String) : Pessoa(name, address)

class Aluno(var matriculaId: Int, name: String, address: String) : Pessoa(name, address)