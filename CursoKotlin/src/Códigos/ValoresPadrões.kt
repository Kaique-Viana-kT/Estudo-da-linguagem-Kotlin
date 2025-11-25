fun main(){
    cadastroUsuario(nome = "Rodrigo", idade = 23, isAdmin = true) // aqui mudou o valor padrao
    cadastroUsuario(18, "kaique")
    cadastroUsuario(35, "raimundo") //aqui existe um valor padrao
    cadastroUsuario(35)

}

//valor padrao (default)
fun cadastroUsuario(idade: Int, nome: String = "Desconhecido", isAdmin: Boolean = false){
    println("INSTRUÇÃO01 = Usuario cadastrado com idade: $idade, nome: $nome, admin: $isAdmin")
}

/**
fun cadastroUsuario(idade: Int, nome: String){
    println("INSTRUÇÃO02 = Usuario cadastrado com idade: $idade,nome: $nome")
}**/