fun main(){
     //functions - blocos de codigo reutlizaveis]
    olaMundo() //call - chama a funçao
    val resposta = somar()
    println(resposta)
}

//função sem retorno
fun olaMundo(){
     println("Ola")
}

//função com retorno
fun somar(): String{
    return "Estou somandeo 2 + 1 = ${2 + 1}"
}