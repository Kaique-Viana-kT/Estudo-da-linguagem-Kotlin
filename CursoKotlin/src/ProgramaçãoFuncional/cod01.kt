package ProgramaçãoFuncional

fun main(){
    calc(3,5,::sum)

    //essa forma aqui você cira a função na passagem de paramentro
    //sem necessariamente cria uma nova função fora da main
    //1.
    calc(5,4) {
        x,y -> x * y //lambda - função anonima
    }

    //2.
    calc(5,4, {
            x,y -> x * y //lambda - funçao anonima
    })

    val users = listOf(
        User("Kaique", true),
        User("Thiago Silva", false),
        User("Thiago rodrigues", true)
    )

    val filtro = users.filter(::filtro)
    filtro.forEach{users -> println(users)}
}

fun filtro(user: User): Boolean{
    return user.name.contains("Thiago")
}

fun sum(x: Int, y: Int): Int{
    return x+y
}

fun minus(x: Int, y: Int): Int{
    return x-y
}


//função generica que vai calcular a partir de dois numeros
//e vai executar alguma operação, seja ela qual for
fun calc(a: Int, b: Int, operation: (Int,Int) -> Int){
    val result = operation(a,b)
    println("Resultado da operação $a com $b : $result")
}

data class User(var name: String, var isAdmin: Boolean)