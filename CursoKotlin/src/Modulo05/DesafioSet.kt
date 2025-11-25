package Modulo05

import kotlin.random.Random

fun main(){
    val res = geradorDeApostas(6)
    println("Listas geradas $res")
}

fun geradorDeApostas(numeroMax: Int): Set<Int>{
    val resultado = mutableSetOf<Int>()
    while (resultado.size < numeroMax){
        val numeroApostas = Random.Default.nextInt(60)
        resultado.add(numeroApostas + 1)
    }
    return resultado
}