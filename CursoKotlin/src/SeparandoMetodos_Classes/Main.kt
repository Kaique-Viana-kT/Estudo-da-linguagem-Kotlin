package SeparandoMetodos_Classes

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

    var userALength = user1.getNameLength()
    println(userALength)

    var user2 = User()
    user2.name = "Rodrigo"
    println(user2.getNameLength())
}
