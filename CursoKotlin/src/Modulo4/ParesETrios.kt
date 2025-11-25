package Modulo4

fun main(){
    val userA = User02("kaique", true)

    //estrutura de dados simples - pair/triple
    val coordenadas =  Pair(10,"Kaique") //o PAIR é um data class
    val usuariPeloId =  10 to "Kaique"
    println(usuariPeloId.first)
    println(usuariPeloId.second)

    val triple = Triple(200,100, 1)
    println(triple.first)
    println(triple.second)
    println(triple.third)
}

class Coordinate(var x: Int, var v: Int)

data class User02(var name: String, var isAdmin: Boolean)