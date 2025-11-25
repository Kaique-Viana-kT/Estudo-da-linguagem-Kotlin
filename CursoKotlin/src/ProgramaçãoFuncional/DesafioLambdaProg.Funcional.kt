package ProgramaçãoFuncional

fun main(){
    lognNetflix("kaique@gmail.com"){email ->
        "usuario $email conectado acessando pelo Smart Tv"
    }

    lognNetflix("roger@gmai.com",::iphone)
}

fun iphone(email: String): String{
    return "Conectando com $email pelo iphone 16"
}

fun lognNetflix(email: String, dispositivo: (String) -> String){
    println("Conectando com: $email")
    val aparelho = dispositivo(email)
    println("dispositivo conectado $aparelho")
}
