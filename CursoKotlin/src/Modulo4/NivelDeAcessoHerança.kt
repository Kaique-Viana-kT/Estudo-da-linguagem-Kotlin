package Modulo4

fun main(){

    val p = Profesor1("Girafales", "Rua A")
    println(p.descricao1())
    val a = Aluno1(1234, "Triago", "Rua B")
    println(a.descricao1())

    //protected -> somente classes parentes podem ter acesso a essa variavel
    //priavte -> somente a classe atual pode acessar as propriedades
    //nada - defalut -> qualquer um pode acessar ou mudar

    val olaMundo = TextView("Olá Mundo")
    olaMundo.render()

    val botaloLogin = ButtonView("Entrar", "#F00")
    botaloLogin.render()
}

open class TextView(var text: String){
    var textColor = "#000"
    fun render(){
       //codigo que desenha na tela
        println("desenhando $text na cor $textColor")
    }
}

class ButtonView(text: String, var backgroundColor: String) : TextView(text){

}

open class Pessoa1(var name: String, var address: String){
    //nivel de acesso false
    protected var acessoBiblioteca = false

    fun descricao1() = "Meu nome é $name e meu endereço é: $address. Nivel de acesso: $acessoBiblioteca"
}

class Profesor1(name: String, address: String) : Pessoa1(name, address){
    init {
        //alterando nivel de acesso
        acessoBiblioteca = true
    }
}


class Aluno1(var matriculaId: Int, name: String, address: String) : Pessoa1(name, address) {

}