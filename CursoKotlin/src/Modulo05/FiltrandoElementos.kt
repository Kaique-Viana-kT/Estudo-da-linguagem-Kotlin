package Modulo05

fun main(){
    val users = mutableListOf<User>(
        User("Kaique",true),
        User("roger",true),
        User("maGRIN",false)

    )

    //filtrando só os administradores
    val filtered1 = users.filter{user->
        user.isAdmin

    }

    //filtra todo mundo com letras minusculas que possui ka no nome
    val filtered2 = users.filter{
        it.nome.lowercase().contains("ka")
    }

    //filtra todo mundo que não contem ka no nome
    val filtered3 = users.filterNot{
        it.nome.lowercase().contains("ka")
    }

    //filtrando o primeiro nome da lista, se for joana vai aparecer joana, senaqo vai aparecer null
    val objFiltered4 = users.firstOrNull{it.nome == "Joana"}
    println(objFiltered4)

    filtered1.forEach{ println(it) }
    filtered2.forEach{ println(it) }
    filtered3.forEach{ println(it) }

}

data class User(var nome: String, var isAdmin: Boolean)