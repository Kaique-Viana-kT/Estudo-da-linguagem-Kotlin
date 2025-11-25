fun main(){
    var nome: String? = null

    //todo: se for null ele vai cair no "Usuario desconhecido" pois a variavele é nula

    val boasVindas =  nome ?: "Usuario desconhecido"
    println("Bem-vindo(a), $boasVindas")
}