package Modulo05

fun main(){
    val list = listOf(1,2,3,4,5,6,7,8,9)
    val textList = list.joinToString(",")
    val res = acumulador(list)
    println("A soma de $textList é :$res")
}

fun acumulador(acumulador: List<Int>): Int{
    var resultado = 0
    acumulador.forEach{
       resultado += it
    }
    return resultado
}
