package Modulo4

fun main(){
    val user = User("Tiago", false)

    //Quando - when

    val creditCardAPI = "mastercard"
    val card = CreditCard1.valueOf(creditCardAPI.uppercase())

    /**
    when(card){
        CreditCard1.VISA -> println("GANHOU DESCONTO!")
        else -> println("nenhum desconto aplicado")
    }**/



    //Bloco de código dentro da variavel
    val discount1 = if(card == CreditCard1.VISA){
        "Disconto de 10%" // <- return do bloco de condição
    }else if(card == CreditCard1.MASTERCARD){
        "Discontp de 20%"
    }else{
        "desconto não aplicado"
    }
    println(discount1)

    val discount = when(card){
        CreditCard1.VISA -> "ganhou desconto"
        CreditCard1.ELO -> "sem desconto"
        else -> "sem desconto"
    }
    println(discount)


    //1.Forma
    when(user.name){
        "Bruce" -> {
            println("Bruce encontrado no banco de dados")
        }
        "Marcelo" -> {
            println("Marcelo está ao vivo")
        }
        else -> println("Nenhum usuario encontrado") //bloco inline
    }

    //2.Forma
    when{
        user.name == "Bruce" -> println("Bruce encontrado")
        else -> println("Ninguem foi encontrado")
    }

    /**
    if(user.name == "Bruce"){
        println("Bruce encontrado no banco de dados")
    }else if(user.name == "Marcelo"){
        println("Marcelo está ao vivo")
    }else{
        println("Nenhum usuario encontrado")
    }**/
}

class User(var name: String, var isAdmin: Boolean){

}

enum class CreditCard1(val label: String, val percent: Int){
    VISA("VISA", 10), //o valor vai ao lado
    MASTERCARD("MASTERCARD", 20),
    ELO("ELO", 15),
    AMEX("AMERICAN EXPRESS", 5)
}

