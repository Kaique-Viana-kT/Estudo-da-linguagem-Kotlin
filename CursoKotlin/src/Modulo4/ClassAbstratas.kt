package Modulo4

fun main(){
    //abstract (abstração) -> não é algo concreto - voce não tem uma ideia formada sobre aquilo

    val nicole = Musico("Dimie rendirx")
    val kiko =  Musico("rennan poga")
    val vicktore = Musico("Viclkroto")

    val f = Flauta("Transversal")

    val g = Guitarra("guitarx")

    val v = Violino("Violinoy")

    tocar(f,nicole)
    tocar(g, kiko)
    tocar(v, vicktore)
}

fun tocar(instrumento: Instrumento, musico: Musico){
    instrumento.tocar(musico)
}

class Musico(var nome: String)

//class vó
abstract class Instrumento(var nome: String){

    //a assinatura da função é a mesma (afinar) -> abstrato
    //só que, o comportamneto de afinar é diferente -> concreto
    abstract fun afinar() : Boolean

    fun tocar(musico: Musico){
        if(afinar()){
            println("estou tocando o instrumento $nome com o music ${musico.nome}")
        }else{
            println("Por favor, ${musico.nome} afine seu instrumento")
        }
    }
}

//class mãe
abstract class InstrumentoDeCorda(nome: String, var cordas: Int) : Instrumento(nome){
    //essa classe não é obrigada a definir o comportamento da assinatura abstract, pois ela é abstract
}

//class filha
class Guitarra(nome: String) : InstrumentoDeCorda(nome, 6){
    override fun afinar() : Boolean{
        println("Afinação em E(mi)")
        return true
    }
}

class Violino(nome: String) :  InstrumentoDeCorda(nome, 5){
    override fun afinar() : Boolean{
        println("Afinação em ré(D)")
        return false
    }
}

class Flauta(nome: String): Instrumento(nome){
    override fun afinar() : Boolean{
        println("Afinação em dó(C)")
        return true
    }
}
