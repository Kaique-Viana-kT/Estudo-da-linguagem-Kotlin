package Modulo05

fun main(){
    val users = mutableSetOf(
        UserB("Thiago", true),
        UserB("Lucas", true),
        UserB("Thiago", true),
    )

    users.forEach{ println(it) }
}

data class UserB(var nome: String, var isAdmin: Boolean)