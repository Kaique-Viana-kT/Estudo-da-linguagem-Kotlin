package Modulo05

fun main(){
    //tamanho fixo
    val itens = intArrayOf(1,2,3,4,5,6,7,8,23)
    // | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
    //   ^   ^   ^   ^   ^   ^   ^   ^   ^
    //   0   1   2   3   4   5   6   7   8
    //O ÍNDICE COMEÇA EM 0

    //tamanho do array
    val tamanho = itens.size
    println("esse é o tamanho do elemento: $tamanho")

    //acessar o ultimo elemento do array
    val ultimoElemento = itens[tamanho-1]
    println("esse é ultimo elemento $ultimoElemento")

    //acessando o array
    val itemA = itens[0]
    println(itemA)


    //todo: 1 - LOOP - acesar o indice pelo contador
    for (i in 0 until itens.size){ //quando voce precisa do indice para fazer alguma logica
        //val item = itens[i]
        //println(item)
    }

    //todo: 2 - acessa direto o objeto com for
    //isso é usado quando voce não precisa do indice
    for (item in itens){
        println(item)
    }

    //todo: 3 - usa uma funçao da lista
    itens.forEach { //"percorra para cada item dessa lista, e devolva pra mim dentro de it"
        numero ->
        println(numero)
    }

    arrayOf("Mensagem01", "Mensagem02" ,"etc")
}