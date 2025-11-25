fun main(){
    verificaçãoDeIdade(idade = 18, nome = "kaique", isAdmin = true)//dar nome aos argumnentos
    verificaçãoDeIdade(14, "rennan", false) //nao dar nome aos args
    verificaçãoDeIdade(nome = "kaique", idade = 18, isAdmin = true)//reodernar os args
}

fun verificaçãoDeIdade(idade: Int, nome: String, isAdmin: Boolean){

    println("Minha idade é $idade, meu nome é $nome, voce é admin: $isAdmin")

}