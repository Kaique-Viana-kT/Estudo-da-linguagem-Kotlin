package Modulo05

fun main(){
    val list = listOf(1,2,3,4,5,6,7,8,9)
    val textList = list.joinToString(",")
    val respost = listasPares(list)
    println("a lista possui $textList  os pares: $respost")
}

fun listasPares(origem: List<Int>): List<Int>{
    //mod, se o resultado for igual a zero
    val resultado = origem.filter { it % 2 == 0}
    return resultado
}