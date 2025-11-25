package Modulo4

fun main(){
//    println(CreditCard.VISA.ordinal)
//    println(CreditCard.MASTERCARD)
//
    val creditCardAPI = "mastercard"
    val card = CreditCard.valueOf(creditCardAPI.uppercase())

    println("Voce esta usando o cartão ${card.label}, com ${card.percent}% desconto")

    if (card == CreditCard.VISA){
        println("Da desconto")
    }else{
        println("Cartão Visa tem desconto")
        println("Voce esta usando o cartão ${card.label}")
    }


}

//ao declarar o construtor
enum class CreditCard(val label: String, val percent: Int){
    VISA("VISA", 10), //o valor vai ao lado
    MASTERCARD("MASTERCARD", 20),
    ELO("ELO", 15),
    AMEX("AMERICAN EXPRESS", 5)
}

