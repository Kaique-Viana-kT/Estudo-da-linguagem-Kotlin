fun main (){
    val userA = Usuario()
    userA.nome = "Kaique"
    val userB = Usuario()
    userB.nome = "Thiago"

    userA.imprimirCaixaAlta()
    userB.imprimirCaixaAlta()
}

class Usuario {
    var nome: String = ""

    fun imprimirCaixaAlta(){
        println("Ola " + nome.uppercase())
    }

}

