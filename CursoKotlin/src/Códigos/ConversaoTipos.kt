fun main(){
    //padrão CAMEL CASE (seEscreveAssim)
    val mediaDePreco = "22"
    println(mediaDePreco::class)
    val resposta = mediaDePreco.toInt()
    println(resposta::class)

    var numero = "1" + "1"
    println(numero) //junção de caracteres especificos (não é uma soma)


}