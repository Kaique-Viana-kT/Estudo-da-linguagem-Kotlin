package Main01

fun main(){
    val conta01 = ContaBancaria()
    conta01.titular = "KAIQUE VIANA"
    conta01.depositar(1200.0)
    conta01.sacar(500.0)

    val buscarSaldo = conta01.buscarSaldo()
    println("O saldo de ${conta01.titular} é de R$$buscarSaldo")
}

class ContaBancaria{
    var saldo: Double = 0.0
    var titular: String = ""

    fun depositar(valor: Double){
       saldo = saldo + valor
    }

    fun sacar(valor: Double){
        saldo = saldo - valor
    }

    fun buscarSaldo(): Double{
        return saldo
    }
}