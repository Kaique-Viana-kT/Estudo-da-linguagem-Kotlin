package Modulo4

fun main(){
    val kikoLoureiro = Musician1()
    kikoLoureiro.desc()

    kikoLoureiro.Guitar().desc()

    val sax = Musician1.Sax()
    sax.desc()

    //1.Classes Aninhadas
    //2.Classes Internas
    //3.Classes Enumeradas
}

class Musician1{
    var style: String ="Rock" //propriedades de objeto
    fun desc() = println("Meu estilo é: $style")

    //Nested Class - classes que dependem de outras classes
    //inner class - classes internas
    inner class Guitar{
        var strings = 6
        fun desc() = println("Tocando uma guitarra com $strings cordas $style")
    }

    class Sax{
        var family = "Sopreno"
        fun desc() = println("A familia do Saxofone é $family")
    }
}