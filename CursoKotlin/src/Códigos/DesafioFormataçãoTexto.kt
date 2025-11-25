fun main(){
    val name = "Kaique"
    val dataNasc = 2004
    val idadeEm2050 = 2050 - dataNasc
    println("""
        Olá $name. Em 2050 voce terá $idadeEm2050 anos. Seu nome possui ${name.length} caracteres
    """.trimIndent())
}