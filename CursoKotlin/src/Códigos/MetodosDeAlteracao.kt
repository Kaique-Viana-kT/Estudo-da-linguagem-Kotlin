fun main(){
    val user1 = User()
    user1.name = "Roger"
    val res = user1.getUpperCase()
    println(res)

    user1.updateName("kaique")

    user1.printUpperCase()

    val buttonSucess = Button()
    buttonSucess.text = "Sucesso"
    buttonSucess.color = "Verde"

    val buttonCancel = Button()
    buttonCancel.text = "Cancelar"
    buttonCancel.color = "Vermelho"
}

class User(){
    var name: String = ""

    fun getUpperCase(): String {
        return "Olá, " + name.uppercase()
    }

    fun printUpperCase(){
        println("Olá, " + name.uppercase())
    }

    fun updateName(newName: String){
        name = "$newName Atualizado com Sucesso!"
    }

}

class Button{
    var text: String = ""
    var color: String = ""
}