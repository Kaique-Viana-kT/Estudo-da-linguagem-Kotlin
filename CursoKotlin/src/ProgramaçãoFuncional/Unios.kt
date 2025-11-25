package ProgramaçãoFuncional

fun main(){
    val numbers = listOf(1,2,3,4,5,6)
    val numbers2 = listOf(1,2,4,7,8)
    val result = numbers.union(numbers2)

    result.forEach{println(it)}

    //devolvve o indece e o elemento
    result.forEachIndexed{index, el->
        println("indece: $index, elementos: $el")
    }
}