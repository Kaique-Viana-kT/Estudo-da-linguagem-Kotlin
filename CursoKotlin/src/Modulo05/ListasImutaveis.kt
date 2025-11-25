package Modulo05

fun main(){
    //array - mais direto, menos recursos
    //list - tambem é coleção de dados, so que possui uma
    //serie de funçoes extras, para objetos faz mais sentido

    val contatos = listOf(null, "Thiago", "roger", "Miguel")
    val primeiroElemnto = contatos.first()
    val ultimoElemnto = contatos.last()
    val elementoNull = contatos.firstOrNull()
    println(primeiroElemnto)
    println(ultimoElemnto)
    println(elementoNull)

    //exemplo de criação de lista sem valores inciais, o resultado é null
    val contatos1 = listOf<String>()
    println(contatos1.firstOrNull())

    //verifica se NÃO HÁ elemento na lista TRUE SE NÃO HOUVER ITEM
    //está vazio
    if(contatos.isEmpty()) println("A lista está vazia")
    else println("a lista contem valores")

    //Verifica SE TEM elementos na lista TRUE SE TIVER ALGUM ITEM
    //não esta vazio
    if(contatos.isNotEmpty()) println("A lista não é vazia")
    else("A lista está vazia")

    //retorna a posição do valor indicado
    val index = contatos.indexOf("Thiago")
    println(index)

    //cria uma unica lista, colocando todos os valores para mostrar na tela e separando por virgula
    val res = contatos.joinToString(",")
    println(res)

    //vai mudar toda a ordem da lista - cada vez que voce imprimir a ordem é diferente
    val embaralhar = contatos.shuffled()
    println(embaralhar)
    //vai buscar o elemento atraves do indice
    println(embaralhar[2])

}

data class Usuario2(var email: String, var senha: String)
