package Main01

fun main(){
    /**************USER1******************/

    val user1 = User()
    user1.name = "Kaique Viana"
    user1.password = "123"
    println(user1.name)

    println("Antes de alterar a senha")
    println(user1.password)

    user1.updatePassword(user1.name)

    println("Senha alterada")
    println(user1.password)

    /**************USER2******************/

    val user2 = User()
    user2.name = "Rogerio" //ESSE É O VALOR
    user2.password = "mamae"

    println(user2.name)
    println("Senha1")
    println(user2.password)

    println("Senha2") //Atualizada

    //Não foi preciso colocar um valor dentro do comportamento, pois o name já está com valor armazenado
    user2.updatePasswordV2()
    println(user1.password)
}

class User(){
    var name: String = ""
    var password: String = ""

    fun updatePassword(initalValue: String){

        //hashCode - numero gerado com base nas variaveis daquele obj
        //o IF/ELSE foi criado porque o valor inicial é 0, quando não for declado nenhum nome ou senha

        if(initalValue == ""){
            password = "123teste" //senha padrao
        }else {
            val number = Math.abs(initalValue.hashCode())
            password = number.toString()
        }

    }

    fun updatePasswordV2(){
        if(name == ""){
            password = "123teste"
        }else {
            val number = Math.abs(name.hashCode())
            password = number.toString()
        }

    }
}