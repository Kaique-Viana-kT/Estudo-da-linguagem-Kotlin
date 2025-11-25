fun main(){

    //SOBRECARGA SIGNIFICA FUNCOES COM O MESMO NOME E PARAMETROS DIFERENTES
    verificacaoParaLogin(18,"kaique", true)
    verificacaoParaLogin(12, "ronaldo")
}

fun olaWorld(){

}

//PODE ESXISTIR FUNCOES COM O MESMO NOME, POREM PARAMETROS DIFERENTES
fun verificacaoParaLogin(idade: Int, nome: String, isAdmin: Boolean){
    println("Instrução01 = Minha idade é $idade, meu nome é $nome, sou admin $isAdmin")
}

fun verificacaoParaLogin(idade: Int, nome: String){
    println("Instrução02 = Minha idade é $idade, meu nome é $nome")
}

