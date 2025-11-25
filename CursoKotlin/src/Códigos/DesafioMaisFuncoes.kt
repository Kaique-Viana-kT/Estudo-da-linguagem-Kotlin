fun main(){
    println("Digite um numero de 1 a 4:")
    println("1 Celsius para Fahrenheit")
    println("2 Fahrenheit para Celsius")
    println("3 Quilômetros para Milhas")
    println("4 Milhas para Quilômetros")

    var numero = readln().toInt()

    if(numero == 1){
        println("Digite um numero para converter:")
        CelsiusparaFahrenheit(readln().toInt())
    }
    else if(numero == 2){
        println("Digite um numero para converter:")
        FahrenheitparaCelsius(readln().toInt())
    }
    else if(numero == 3){
        println("Digite um numero para converter:")
        QuilometrosparaMilhas(readln().toInt())
    }
    else if(numero == 4){
        println("Digite um numero para converter:")
        MilhasparaQuilometros(readln().toInt())
    }
    else println("ERRO, ESCOLHA ALGUM DOS NUMEROS SUGERIDOS")

}

fun CelsiusparaFahrenheit(medida: Int){
    val conversao = (medida * 9/5) + 32
    println("$medida C = $conversao F")
}


fun FahrenheitparaCelsius(medida: Int){
    val conversao = 5/9 * (medida - 32)
    println("$medida F = $conversao C")
}

fun QuilometrosparaMilhas(medida: Int){
    val conversao = medida * 0.621371
    println("$medida KM = $conversao Milhas")
}

fun MilhasparaQuilometros(medida: Int){
    val conversao = medida * 1.60934
    println("$medida Milhas = $conversao KM")
}
