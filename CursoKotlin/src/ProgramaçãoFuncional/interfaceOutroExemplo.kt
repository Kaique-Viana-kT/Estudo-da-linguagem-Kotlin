package ProgramaçãoFuncional

import java.io.FileWriter
import java.io.IOException

//sistema de log que é possivel trocar a implementação
fun buscarSistemaDeLog(): LOggerGenerico{
    return SistemConsole()
}

fun main(){
    val userA = UsuarioInstagram(buscarSistemaDeLog())
    userA.criarPublicacao()

    val userB = UsuarioInstagram(buscarSistemaDeLog())
    userB.criarPublicacao()

}

interface LOggerGenerico{
    fun print(message: String)
}

class SistemConsole: LOggerGenerico{
    override fun print(message: String) {
        println(message)
    }
}

class SistemaArquivo: LOggerGenerico{
    override fun print(message: String) {
        // comportamento -> escrever no arquivo uma mensagem pq eu sou o sistema de log via arquivo
       val path = "Usuários/viana/Downloads/interfaceOutroExemplo.txt"
        try{
            val fw = FileWriter(path,true)
            fw.write(message)
            fw.write("\n")
            fw.close()
        }catch (e: IOException){
            e.printStackTrace()
        }
    }
}

class UsuarioInstagram(val logger: LOggerGenerico){

    init{ //inicialização
        log("Usuario Criado!")
    }

    fun criarPublicacao(){
        log("NOVO POST CRIADO!")
    }

    fun log(mensagem: String){
        logger.print(mensagem)//função print vem da inteface
    }
}