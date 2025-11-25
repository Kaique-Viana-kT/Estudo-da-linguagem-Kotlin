fun main(){
    val user1 = Usuario1()
    user1.nome = "kaique"
    val result = user1.getNomeEmCaixaAlta()
    println(result)
}

class Usuario1 {
     var nome: String = ""
     fun getNomeEmCaixaAlta(): String{
         return nome.uppercase()
     }
}






