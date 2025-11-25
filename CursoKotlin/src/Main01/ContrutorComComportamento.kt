package Main01

fun main(){
    var user1 = User3("joe")

    var user2 = User3()
    println()
}


class User3 constructor(var name: String,var isAdmin: Boolean){

    //construtor secundário - com compotamento
    constructor(name: String): this(name,false){//chamou o primario
        if (name.length <= 3){
            println("Usuario $name possui poucos caracteres!")
        }
    }

    constructor(): this("desconhecido"){//chamou o secundario
        println("EXECUTE O CONSTRUTOR 3")
    }

    fun printUpperCase(){
        println("Olá" + name.uppercase())
    }

    fun updateName(newName: String){
        name = newName
    }

    fun getNameLength(): Int{
        return name.length
    }
}