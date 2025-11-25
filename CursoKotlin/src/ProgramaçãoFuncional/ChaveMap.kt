package ProgramaçãoFuncional

fun main(){

    //IMUTAVEIS - MUTAVEIS
    //listOf  ->  mutableListOf
    //setOf   ->  mutableSetOf
    //mapOf   ->  mutableMapOf

    val product = mutableMapOf( //chave-valor
        "Android" to "Google",
        "iOS" to "Apple",
        "Windows" to "Microsoft"
    )

    //por padrao map é do tipo null
    val res = product["Android2"]
    println(res)

    //valor padrão caso não haja um valor
    val valorPadrao = product.getOrDefault("Android2", "Chave não existe")
    println(valorPadrao)

    //tambem retorna um valor padrao - Se a chave não existir, ele executa uma
    //lambda (função) que retorna um valor alternativo.
    val busqueOuFacaOutraCoisa = product.getOrElse("Android2"){
        "Não existe essa chave "
    }
    println(busqueOuFacaOutraCoisa)

    val session = mapOf(
        "token" to "1133454"
    )

    //utilizado para verificar se uma chave existe em um Map
    val hasToken1 = session.containsKey("token")
    if(hasToken1){
        println("Exibir a tela principal do meu app")
    }else{
        println("exibir a tela do usuario")
    }

    //utilizado para verificar se um valor existe em um Map
    val hasToken2 = session.containsValue("1233")
    if(hasToken2){
        println("Exibir a tela principal do meu app")
    }else{
        println("exibir a tela do usuario")
    }
//    todo: isEmpyt verifica se ta vazia a lista
//    product.clear()
//
//    if(product.isEmpty()){
//        println("a lista esá vazia ")
//    }

    //mudou o valor
    product["Android"] = "empresaxy"

    //remove android e o que está associado a ele
    product.remove("Android")

    //aqui está removendo tanto a chave quanto o valor associado
    product.remove("Android", "Google")// retorna true

    //limpa toda a coleção
    product.clear()

    println(product.keys) //imprime todas as chaves
    println(product.values) //imprime os valores
}

