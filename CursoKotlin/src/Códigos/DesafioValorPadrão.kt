fun main(){
    calcularDesconto(precOriginal = 100.0, Promocao = "NATAL")
}

fun calcularDesconto(precOriginal: Double, desconto: Double = 0.0, imposto: Double = 5.0, Promocao: String = "") {

    val precoComDesconto = precOriginal - desconto
    val precoFinal = precoComDesconto + imposto

    println("Resumo da Transação ====")
    println("Preço Original : R$$precOriginal")
    if (desconto > 0) println("Desconto: R$$desconto")
    if (imposto > 0) println("Imposto: R$$imposto")
    if (Promocao != "") println("Promoção: $Promocao")
    println("Preço Final: R$$precoFinal")
}