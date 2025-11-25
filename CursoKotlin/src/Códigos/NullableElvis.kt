fun main(){
    //string nula, aceita valores null
    val produto: String? = "Rua A"

    /** 1.
    if(produto != null) {
        val qtdDeCaracteres = produto.length
        println(qtdDeCaracteres)
    }
    **/

    /** 2.
    val qdtDeCaracteres = produto?.length
    println(qdtDeCaracteres)
    **/

    /**
    val qdtDeCaracteres = if (produto != null) produto.length else 0
    println(qdtDeCaracteres)
    **/

    //operador elvis
    val qdtDeCaracteres = produto?.length ?: 0
    println(qdtDeCaracteres)
}