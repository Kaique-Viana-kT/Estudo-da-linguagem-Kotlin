package Main01

fun main(){
    val num = calculadora(10.0,2.0)
    println("Adição: ${num.Adicao()}")
    println("Subtração: ${num.Subtracao()}")
    println("Multiplicação ${num.Multiplicacao()}")
    println("Divisão: ${num.Divisao()}")

}

class calculadora(var x: Double, var y: Double){
    fun Adicao(): Double{
        return x + y
    }

    fun Subtracao(): Double{
        return x - y
    }

    fun Multiplicacao(): Double{
        return x * y
    }

    fun Divisao(): Double{
        if (y == 0.0){
            println("ERRO")
            return 0.0
        }

        return x/y
    }
}