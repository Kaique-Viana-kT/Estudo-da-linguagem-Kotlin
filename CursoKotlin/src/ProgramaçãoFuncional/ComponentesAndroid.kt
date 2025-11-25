package ProgramaçãoFuncional

fun main(){
    val telaPricipal = TelaPrincipal()
    val linkEntrar = Link("Entrar", 10 to 20)
    println("antes do click no linl")
    linkEntrar.clickListener = telaPricipal
    linkEntrar.click()
    println("depois do click no linl")
}

class TelaPrincipal: OnClickListener{
    override fun onClick() {
        println("Tela principal recebeu o evento de click de alguem")
    }
}


abstract class Component{
    abstract fun position(): Pair<Int,Int>

    //classe concreta
    open fun render(){
        println("desenhando na tela")
    }
}

// aqui fica dentro do SDK - KIT DE DESENVOLVIMENTO DE SOFTWARE
abstract  class Text(val text: String, val pos: Pair<Int,Int>): Component(){
    override fun render() {
        super.render()
        println("desenhando o texto $text")
    }
}

class Btn(text: String, val backgroundColor: Int, pos: Pair<Int,Int>) : Text(text,pos){
    override fun position(): Pair<Int, Int> {
        return pos
    }

    override fun render() {
        super.render()
        println("Desenhando a cor $backgroundColor")
    }
}

class Link(text: String, pos: Pair<Int, Int>) : Text(text,pos){

    //cria uma variavke que é do tipo interface
    lateinit var clickListener: OnClickListener

    override fun position(): Pair<Int, Int> {
        return pos
    }

    //metodo para chamar a interface
    fun click(){
        //depois chama o comportamento
        clickListener.onClick()
    }
}

interface OnClickListener{
    fun onClick()
}

