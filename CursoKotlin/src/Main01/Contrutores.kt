package Main01

fun main(){
    //é obrigatorio passar o nome para o construtor
    val user1 = Contrutores("kaique",true)
    println(user1.name)
    println(user1.isADMIN)

    val user2 = Contrutores("Ronaldo", false)
    println(user2.name)
    println(user2.isADMIN)

    user2.imprimirInformações()

}

class Contrutores(var name: String, var isADMIN: Boolean){
    fun imprimirInformações(){
        println("Nome: $name, isAdmin: $isADMIN")
    }
}