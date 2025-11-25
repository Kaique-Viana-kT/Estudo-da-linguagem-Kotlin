package Modulo05

fun main(){
    var admins = arrayOf("Tiago", "Phelipe", "Rodrigo")

    admins.forEach { println(it) }

    //plus usa elementos da lista antiga e adiciona mais um elemento, assim criando
    //uma noova lista com mais um elemnto
    admins = admins.plus("RODRIGO")
    admins.forEach { println(it) }

    val usuarios = arrayOf(
        Usuario("A@FFgmail.com", "1233434"),
        Usuario("B@fgmail.com", "25455")
    )

    val hexadecimal = 0xf00

    usuarios.forEach { println(it) }
}

data class Usuario(val email: String, val password: String)