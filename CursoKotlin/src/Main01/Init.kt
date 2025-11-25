package Main01

fun main(){
    //INIT - é como o construtor (só que não tem parametros) e é executado depois do construtor padrao
    var user1 = Teste("KAAIQUE")
    user1.label = "trocar o texto"
    println(user1.label)

}

class Teste(var name: String, var isAdmin: Boolean){

    //propriedade de um objeto
    var label = "$name é admin do sistema: $isAdmin"

    init { // 3.inicializa o bloco init
        println("Ola $name")
    }

    //4.depois executa o segundo construtor
    constructor(name: String): this(name,false){// 2. chamou o primario
        println("Execute o construtor 2")
    }

    // 5.depois executa o terceiro construtor
    constructor(): this("desconhecido"){// 1.chamou o secundario
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