package ProgramaçãoFuncional

fun main(){
    val users = listOf(
        User("Kaique", true),
        User("Thiago Silva", false),
        User("Thiago rodrigues", true)
    )

    users.forEach{println(it)}

    val lisName = users.map { user -> //lambda
        user.name.uppercase() //pegou o "user" e com o ".name" transformou a lista de nomes em string
    }
        .filter { it.contains("I") }

    lisName.forEach{println(it)}

}