//TODO: REFAZER ESSE DESAFIO

fun main(){
    val boasVindas = saudacao()
    println("$boasVindas, Madruguinha")
}

fun saudacao(): String{
    var horaAtual = 0
    var resposta = ""
    if(horaAtual > 23 || horaAtual < 0) resposta = "Horario invalido"
    else if (horaAtual >= 18) resposta = "Boa Noite"
    else if (horaAtual >= 12) resposta = "Boa Tarde"
    else if (horaAtual >= 6) resposta = "Boa Dia"
    else if (horaAtual >= 0) resposta = "Boa Madrugada"

    return resposta

}