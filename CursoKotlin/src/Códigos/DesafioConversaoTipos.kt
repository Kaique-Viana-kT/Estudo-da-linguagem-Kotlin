fun main(){
    //TODO: Crie um programa que contenha um número inteiro e um texto que representa um número.
    //TODO: Seu objetivo é somar esses dois valores, mas você precisará converter os tipos
    //TODO: corretamente antes de realizar a operação.

    var numero = 40
    var num = "5" //numero para converter

    var conversao = num.toInt() //numero convertido

    var resposta = conversao + numero //soma depois da conversao

    println(resposta)
}