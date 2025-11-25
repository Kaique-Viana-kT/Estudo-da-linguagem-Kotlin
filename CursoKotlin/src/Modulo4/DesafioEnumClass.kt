package Modulo4

fun main(){
    println("DIGITE QUAL CAFÉ VOCE GOSTARIA: EXPRESSO, CAPPUCCINO, LETTE, MOCHA ")
    val pedido = readln()
    val tipoEscolhido = TipoDeCafe.valueOf(pedido.uppercase())
    fazerPedido(tipoEscolhido)
}

enum class TipoDeCafe{
    EXPRESSO,
    CAPPUCCINO,
    LETTE,
    MOCHA
}

fun fazerPedido(tipoDeCafe: TipoDeCafe){
    println("Voce pediu um $tipoDeCafe")
}

//EXEMPLO DO THIAGO

/**fun main() {
    fazerPedido(TipoDeCafe.ESPRESSO)
    fazerPedido(TipoDeCafe.CAPPUCCINO)
}

enum class TipoDeCafe {
    ESPRESSO,
    CAPPUCCINO,
    LATTE,
    MOCHA
}

fun fazerPedido(tipo: TipoDeCafe) {
    when(tipo) {
        TipoDeCafe.ESPRESSO -> println("Você pediu um Espresso.")
        TipoDeCafe.CAPPUCCINO -> println("Você pediu um Cappuccino.")
        TipoDeCafe.LATTE -> println("Você pediu um Latte.")
        TipoDeCafe.MOCHA -> println("Você pediu um Mocha.")
    }
}**/