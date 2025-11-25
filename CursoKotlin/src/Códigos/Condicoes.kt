fun main(){
    val produto = ""
    println("Quantidade de caracteres ${produto.length}")

    //se, senao -> DEVE SER UMA EXPRESSAO BOOLEANA
    //(<, <=, >, >=, !, !=)
    if (produto.length == 0) {
        println("Voce nao pode cadastrar produtos com nomes pequenos")
    }else{
        println("produto cadastrado com sucesso!")
    }

    val preco = 30_001
    if (preco > 30_000){
        println("Voce ganhou 30% de desconto")
    }else if(preco > 20_000){
        println("Voce ganhou 20% de desconto")
    }else if(preco > 10_000){
        println("Voce ganhou 10% de desconto")
    }else println("Voce não ganhou desconto")

    //TODO: MANEIRAS DE USAR O IF/ELSE
    val idade = 31
    if(idade > 30) println("tenho mais de 30")
    else if (idade > 20)
        println("maneira1")
}