fun main(){
//    val pessoa1 = Pessoa("Kaique", 16, 1.75)
//    pessoa1.imprimirText()
//    pessoa1.newName("Roger")
//
//    val pessoa2 = Pessoa("Rennan", 1.75)
//    pessoa2.imprimirText()

    val pessoa = Pessoa("kaique")

}

class Pessoa(var nome: String, var idade: Int){

    constructor(nome: String) : this(nome,0)

//    constructor(nome: String, altura: Double) : this(nome,0,altura){
//        if(altura >= 1.75)println("Voce é uma pessoa alta")
//        else if(idade == 0) println("Queremos saber sua idade")
//    }
//
//    fun newName(newName: String){
//        nome = newName
//        println("meu novo nome é $nome")
//    }
//
//    fun imprimirText(){
//        println("Olá $nome, sua idade é $idade, voce tem $altura de altura")
//    }

}