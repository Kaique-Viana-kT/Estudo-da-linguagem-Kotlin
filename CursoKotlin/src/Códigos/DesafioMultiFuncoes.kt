fun main(){
    Adição(10,5)
    Subtração(10, 5)
    Multilplicacao(10, 5)
    Divisao(10, 0)
}

fun Adição(num1: Int, num2: Int){
    println("Adição: $num1 + $num2 = ${num1+num2}")
}

fun Subtração(num1: Int, num2: Int){
    println("Subtração: $num1 - $num2 = ${num1-num2}")
}

fun Multilplicacao(num1: Int, num2: Int){
    println("Multiplicação: $num1 * $num2 = ${num1*num2}")
}

fun Divisao(num1: Int, num2: Int){
    if(num2 != 0)  println("Divisao: $num1 / $num2 = ${num1/num2}")
    else  println("Divisao por 0 nao permitida")
}

