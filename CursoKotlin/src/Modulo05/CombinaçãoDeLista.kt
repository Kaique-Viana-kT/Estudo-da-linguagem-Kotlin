package Modulo05

fun main(){
    //combinação 1
    val a = mutableListOf("Thaigo", "Luiz")
    val b = listOf("jao", "rogerio")

    b.filterTo(a,{it.contains("a")})
    println(a)

    //combinação 2
    val c = listOf("A","B")
    val d = listOf("E","F")

    val all = listOf(c,d)
    println(all)
    println(all.flatten())
}