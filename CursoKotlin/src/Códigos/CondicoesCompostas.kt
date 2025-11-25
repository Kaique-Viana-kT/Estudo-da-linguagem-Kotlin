fun main(){
    val preco = readln().toDouble()
    val produto = readln()

    //há o uso de um operador logico
    if(preco == 49.0 && produto == "teclado") println("Sucesso")
    else println("Falha")

    if(preco == 49.0 || produto == "teclado") println("Sucesso")
    else println("Falha")

    //E (&&)
    // true true = true
    // true false = false
    // false treu = false
    // false false = false

    //OU (||)
    // true true = true
    // true false = true
    // false treu = true
    // false false = false
}