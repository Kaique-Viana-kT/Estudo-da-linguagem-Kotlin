package Modulo4

fun main(){
    val book = Book("O Hobbit", "J.R.R. Tolkien")
    val info = book.getInfo()
    println(info)

    val chapter1 = Book.Chapter("Uma festa inesperada", 1)
    val chapter2 = Book.Chapter("Carneiro assado", 2)

    println(chapter1.getChapterInfo())
    println(chapter2.getChapterInfo())
}

class Book(private val title: String, private val author: String){

    class Chapter(val title: String, val number: Int){
        fun getChapterInfo(): String {
            return "Capitulo: $number - $title"
        }
    }

    fun getInfo(): String{
        return "Livro: $title - $author"
    }

}

