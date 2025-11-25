package Modulo05

fun main(){
    val list = mutableListOf("roge","miguel")

    list[1] = "rodrigo"
    list.add("Maria")
    list.addFirst("mario")
    list.addLast("jose")


    val contatosBackup = listOf("Vagner", "Viana")
    list.addAll(contatosBackup)
    list.remove("mario")
    list.removeAt(2)

    list.forEach{println(it)}
}