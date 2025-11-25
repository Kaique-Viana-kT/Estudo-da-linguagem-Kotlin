package ProgramaçãoFuncional

fun main(){
    val listNum = listOf(1,2,3,4,5,6,7,8,9)
    val textList = listNum.joinToString(",")
    val listaEmDobro = listNum.map { it * 2 }
    println("A lista $textList em dobro seria: $listaEmDobro ")
}