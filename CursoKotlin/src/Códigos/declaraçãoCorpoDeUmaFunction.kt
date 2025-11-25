fun main(){
    helloWorld()
    verificaçãoDeIdade(20)
}

fun helloWorld() = println("Ola Mundo") //função Inline

fun verificaçãoDeIdade(age: Int) = if(age > 18) println("Pode Dirigir") else println("NAO Pode Dirigir")
