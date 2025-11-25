package ProgramaçãoFuncional

fun buscarInstrumento(): Tocavel{
    return Violino() //posso trocar o instrumento a qualquer momento
}

//função de buscar rapida, serve para reutilização, onde trocamos apenas uma coisa do código
fun buscarPedido(): Menu{
    return macDonalds() //trocou apenas a dependencia
}

fun main(){

    val musico1 = Musico("Tiago")
    musico1.tocavel = buscarInstrumento()
    musico1.menu = buscarPedido()
    musico1.startPlay()
    musico1.fazerPedido()

}

class Musico(val nome: String){

    lateinit var tocavel: Tocavel //polimorfismo
    lateinit var menu: Menu

    fun startPlay(){
        tocavel.play()
    }

    fun fazerPedido(){
        val combo = menu.comboDoDia()
        println(combo)
    }
}

interface Menu{
    fun comboDoDia(): String
}

class macDonalds : Menu{
    override fun comboDoDia(): String {
        return "Combo MAC"
    }
}

class BK : Menu{
    override fun comboDoDia(): String {
        return "Combo BK"
    }
}

//REGRA DAS CLASSES - TOCAR
interface Tocavel{
    fun play()
}

class Guitar : Tocavel{
    override fun play() { //COMPARTAMENTO TOCAR - DE MANEIRA DIFERENTE
        println("TOCANDO GUITARRA")
    }
}

class Bateria : Tocavel{
    override fun play() { //COMPARTAMENTO TOCAR - DE MANEIRA DIFERENTE
        println("TOCANDO BATERIA")
    }
}

class Violino : Tocavel{
    override fun play() { //COMPARTAMENTO TOCAR - DE MANEIRA DIFERENTE
        println("TOCANDO VIOLINO")
    }
}