package ProgramaçãoFuncional

fun todosDizemOla(personagens: List<Animal>){
    for (personagem in personagens){
        println(personagem.dizerOla())
    }
}

fun main(){
//    val animal1 = animalDoDia()
//    val ola = animal1.dizerOla()
//    println("DIGA OLÁ: $ola")

    val todosOsPersonagens = listOf(Cachorro(), Gato(), Humano(), Papagaio())
    todosDizemOla(todosOsPersonagens)

}

interface Animal{
    fun dizerOla() : String
}

class Cachorro : Animal{
    override fun dizerOla() : String {
       return "AU AU!"
    }
}

class Gato : Animal{
    override fun dizerOla() : String {
        return "MIAU!"
    }
}

class Humano : Animal{
    override fun dizerOla() : String {
        return "OLÁ!"
    }
}

class Papagaio : Animal{
    override fun dizerOla() : String {
        return "TO AQUI!"
    }
}