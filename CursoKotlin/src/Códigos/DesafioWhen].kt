fun main(){
    println("DIGITE O DIA DA SEMANA ABRAVIADO E MAISCULO EX: SEG, TER ... :")
    val diaSemana = readln()

    when(diaSemana){
        "SEG", "TER", "QUA", "QUI", "SEX" -> println("Dia util")
        "SAB","DOM" -> println("Fim de semana")
        else -> println("ERRO")
    }

}