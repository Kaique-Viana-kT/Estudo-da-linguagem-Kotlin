fun main() {
    val usuario1 = Usuario2()
    usuario1.nome = "Tia"

    val saudacao = usuario1.getSaudacao()
    if (saudacao.length > 7) {
        println("Nome válido. $saudacao")
    } else {
        println("Nome inválido. Precisa ter mais de 3 letras para cadastro")
    }
}

class Usuario2 {
    var nome: String = ""

    fun getSaudacao(): String {
        return "Ola, " + nome.uppercase()
    }
}