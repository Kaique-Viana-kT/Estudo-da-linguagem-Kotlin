package Modulo4

fun main(){
    val livro1 = Livro("O Hobbit", "J.R.R. Tolkien", 1937, "Fantasia", 310)
    imprimirLivro(livro1)
    val livro2 = Livro("1984", "Geoge Orwell", 1949, "Distopia", 328)
    imprimirLivro(livro2)
}

data class Livro(
    var titulo: String,
    var autor: String,
    var anoPublicacao: Int,
    var genero: String,
    var pagina: Int
)

fun imprimirLivro(livro: Livro){
    println(livro)
    println("==========")
}