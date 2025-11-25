fun main(){
    println("Digite duas palavras para verificar se elas são iguais:")
    val A = readln()
    val B = readln()

    if(A == B) println("São iguais")
    else println("Não sao iguais")

    println("Digite sua idade:")
    val idade = readln().toInt()
    val eMotorista = true

    if(idade >= 18) println("Pode dirigir")
    if(eMotorista || idade > 16) println("Sou motorista ou tenho mais de 17 anos")
    if(eMotorista && idade > 30) println("Sou motorista ou tenho mais de 30 anos")
    else("Menor de idade")

    val nomeProduto = "iMac"
    val precoProduto = 22000

    if (nomeProduto == "iMac" && precoProduto >= 10_000){
        val desconto = 12
        val calcDesconto = precoProduto * 12/100
        println("desconto aplicado de 12%. Total a pagar R$${precoProduto - calcDesconto}")
        }

}