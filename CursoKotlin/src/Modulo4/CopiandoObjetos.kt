package Modulo4

fun main(){
    val card1 = CreditCard01(122344545, "02/2035")
    val card2 = CreditCard01(34455666, "02/2035")
    val userA = User01("kaique", true, card1)

    val novoUsuarioA = userA.copy(creditCard01 = card2)

    println(novoUsuarioA)

}

data class CreditCard01(val number: Int, val expiration: String)

data class User01(var name: String, var isAdmin: Boolean, val creditCard01: CreditCard01)