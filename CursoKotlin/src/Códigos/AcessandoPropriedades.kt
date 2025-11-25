fun main(){
    val name: String = "Kaique" //OBJETO = tipo
    val tamanhoDoNome = name.length //propriedade de um objeto

    //funçoes que mudam o comportamento de um objeto
    val nomeCaixaAlta = name.uppercase()
    val nomeCaixaBaixa = name.lowercase()

    println("Ola pessoal".length)

    println(nomeCaixaBaixa)
    println(nomeCaixaAlta)
    println(tamanhoDoNome)
}