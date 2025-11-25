fun main(){
    println("Insira o ID do produto:")
    val produtoID = readln().toInt()

    when(produtoID){
        1,3-> println("Voce ganhou 10% de desconto")
        2,4 -> println("Voce ganhou 20% de desconto")
        else -> println("Compra aprovada")
    }
}