package ObjectSingleton

fun main(){
    println("Status inicial: ${NetworkManager.imprimirStatus()}")

    NetworkManager.connect() //Online
    println("Status inicial: ${NetworkManager.imprimirStatus()}")

    NetworkManager.disconnect()//Offline
    println("Status inicial: ${NetworkManager.imprimirStatus()}")
}

object NetworkManager{
    var isConnected = false

    fun connect(){
        isConnected = true
        println("CONEXÃO ESTABELECIDA.")

    }

    fun disconnect(){
        isConnected = false
        println("DESCONECTADO DA INTERNET.")

    }

    fun imprimirStatus(): String{
        if(isConnected){
            return "Online"
        }
        return "Offline"
    }
}





