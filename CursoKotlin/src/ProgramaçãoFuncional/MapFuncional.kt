package ProgramaçãoFuncional

fun main(){
//    val product = mutableMapOf( //chave-valor
//        "Android" to "Google",
//        "iOS" to "Apple",
//        "Windows" to "Microsoft"
//    )
//
//    val contactsGmail = mapOf(
//        1 to "Tiago",
//        2 to "Gabriel",
//        3 to "Renata",
//        4 to "Maria",
//        5 to ""
//    )
//
//    val resultado = contactsGmail.filter{it.value.isNotEmpty()}
//        .map{it.value.substring(0,1)}
//
//    println(resultado)

//    val resultado = product.filter{it.value.contains("e")}
//                           .map{it.value.substring(0,1)} //pegar apenas o primeiro caractere
//
//    println(resultado)


//===============================================================================================

    val users = Usuario.createUsers(10)
    println(users.map{it.last.uppercase()})

}

data class Usuario(var nome: String, var last: String){
    companion object{
        private val users = mutableListOf<Usuario>()

        fun createUsers(count: Int) : List<Usuario>{
            for (i in 0 .. count){
                users.add(Usuario("$i", "desconhecido"))
            }
            return users
        }

    }
}