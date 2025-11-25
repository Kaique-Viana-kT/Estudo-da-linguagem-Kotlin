package Modulo4

fun main(){
    val bnt = Btn("salvar", 0x00F, Pair(20,30))
    bnt.render()

    val link = Link("Entrar!", Pair(45,40))
    link.render()
}

abstract class Component{
    abstract fun position() : Pair<Int,Int>

    open fun render(){
        println("desenando a tela ${position().first} / ${position().second}")
    }

}

abstract class Text(val text: String) : Component(){
    override fun render(){
        super.render()
        println("desenhando o texto: $text")
    }
}

class Btn(text: String, val backgroundColor: Int, val pos: Pair<Int,Int>) : Text(text){
    override fun position(): Pair<Int, Int> {
        return pos
    }

    override fun render() {
        super.render()
        println("pintando o funco com $backgroundColor")
    }
}

class Link(text: String, val pos: Pair<Int, Int>) : Text(text){
    override fun position(): Pair<Int, Int> {
        return pos
    }
}
