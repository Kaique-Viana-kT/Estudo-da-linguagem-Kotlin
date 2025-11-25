package Main01

fun main(){
    var user1 = User02("kaique","viana", true)
    user1.printInfo()

    var user2 = User02("Rogerio",true)//chamou o constructor secundario
    user2.printInfo()

    //A ordem é assim, chamou o construtor secundario, que chama o primario
    //que faz a verificação e executa o constructor
    //o objeto quando for criado pelo constructor secundario, chame this(este) constructor
    //que aqui no caso é o primário
}

//constructor = tipo inferido
class User02 constructor(var name: String, var lastName: String ,var isAdmin: Boolean){

    //construtor secundário
    constructor(name: String, isAdmin: Boolean): this(name,"",isAdmin)

    fun printInfo(){
        println("Nome: $name, Sobrenome: $lastName, isAdmin: $isAdmin")
    }
}

