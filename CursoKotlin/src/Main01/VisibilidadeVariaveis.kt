package Main01

fun main(){
    //visibilidade das suas variaveis
    //val userA = Pessoa("Kiaque", true)

    val controle = PlayerDeVideo(90)

    controle.aumentarVolume()//aumentou 10
    controle.aumentarVolume()//aumentou para 20
    controle.dimunuirVolume()//diminuiu 10

    controle.imprimirVolume()//resultado 10
}

class PlayerDeVideo(private var volume: Int){

    fun aumentarVolume(){
        if(validarVolume()){
            volume += 10
        }
        else println("Volume está fora do limite: ${volume + 10}")
    }

    fun dimunuirVolume(){
        if(validarVolume()){
            volume -= 10
        }else println("Volume está fora do limite: ${volume - 10}")
    }

    private fun validarVolume(): Boolean{
        if(volume > 0 && volume < 100){
            return true
        }
        return false
    }

    fun imprimirVolume(){
        println("Volume final: $volume")
    }

}

//class Pessoa(var nome: String, var isAdmin: Boolean){
//
//    //variavel visivel apenas dentro do objeto
//    private val MAX_NAME_LENGTH = 8 //padrao UPPER_CASE
//
//    init {
//        println("Olá $MAX_NAME_LENGTH")
//    }
//
//    fun updateName(newName: String){
//        if(newName.length > MAX_NAME_LENGTH){
//            //faz o que quiser para validar a atualização do nome
//        }
//        nome = newName
//    }
//}