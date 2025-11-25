fun main(){
    //1.
    val message = "Olá Kaique. \nSeu produto chegou!"
    println(message)

    //2.
    val welcome = """
        Olá KAIQUE,
        Seu produto chegou!
    """.trimIndent()
    println(welcome)

    val csv = """
       Texto1,
       Texto2
    """.replaceIndent(";") //troca os espaços da margem pelo que voce quer
    println(csv)

    //3.
    val name = "Kaique"
    val age = 20
    println("Ola, " + name + " Sua idade é " + age) //primeira forma
    println("Oi $name, sua idade é $age, seu nome tem ${name.length} letras ") //forma mais sofisticada
    println("Sua nova idade ${age + 10}") //expressão dentro da formatação


}