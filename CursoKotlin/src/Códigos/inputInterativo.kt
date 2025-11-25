fun main(){
    println("Digite seu nome:")
    val nome = readln()

    println("Digite sua idade:")
    val entrada = readln()
    val idade = entrada.toInt()
    println("Sua idade é $idade")

    println("o tipo de nome é ${nome::class}")
    println("o tipo de idade é ${idade::class}")

    if(nome == "kaique") println("Ola $nome")
    else println("nao te conheço")

    if(idade > 18) println("Voce é maior de idade")
    else println("Voce é menor de idade")
}