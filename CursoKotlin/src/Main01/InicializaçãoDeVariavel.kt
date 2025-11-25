package Main01

fun main(){
    val userA = User03("kaique", true)
    userA.lastName = "roger"
    userA.output()
}

class User03(var name: String, var isAdmin: Boolean){

    //variavel que será inicializada depois
    lateinit var lastName: String

    fun output() =  println("meu nome é: $name $lastName, sou admin: $isAdmin")
}