package ProgramaçãoFuncional

fun main(){
    val numbers = listOf(1,2,3,4,5,6)
    val numbers2 = listOf(1,2,4,7,8)
    val result = numbers.union(numbers2)

    //for tradicional, percorrendo a lista
    for(number in numbers2){
       println(number)
   }

    //nao vai incluir o intervalo: 3
   for(index in 0 until 3){
        println("index: $index, elemento id: ${numbers[index]}")
   }

    //no forEachIndexed voce percorre a lista toda, o loop serve para voce trabalhar
    //apenas com alguns elementos da lista
    //vai incluir o numero 3, ou seja o range = intervalo
    for(index in 0..3){
       println("index: $index, elemento id: ${numbers[index]}")
   }

    //pular de 2 em 2
   for (i in 0 until 20 step 2){
        println("Numero $i")
    }

    //descrementar, vai comecar em 20 e terminar emk 0 pulando de 2 em 2
    for(i in 20 downTo 0 step 2){
        println("N#$i")
    }

    var i = 0
    while(i < 10){ //usado para renderização em um jogo
        println(i)
        i++
    }
}