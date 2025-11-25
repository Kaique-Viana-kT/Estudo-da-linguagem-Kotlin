package Modulo4

fun main(){
    val kikoLoureiro = Musician()
    kikoLoureiro.desc()

    val guitar = Musician.Guitar()
    guitar.desc()

    val sax = Musician.Sax()
    sax.desc()
}

class Musician{
    var style: String ="Rock"
    fun desc() = println("Meu estilo é: $style")

    //Nested Class - classes que dependem de outras classes
    class Guitar{
        var strings = 6
        fun desc() = println("Tocando uma guitarra com $strings cordas")
    }

    class Sax{
        var family = "Sopreno"
        fun desc() = println("A familia do Saxofone é $family")
    }
}