package SeparandoMetodos_Classes

class User(){
    var name: String = ""

    fun getUpperCase(): String {
        return "Olá, " + name.uppercase()
    }

    fun printUpperCase(){
        println("Olá, " + name.uppercase())
    }

    fun updateName(newName: String){
        name = newName
    }

    fun getNameLength(): Int{
        return name.length
    }
}