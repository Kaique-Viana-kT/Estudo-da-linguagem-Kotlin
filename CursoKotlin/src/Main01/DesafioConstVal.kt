package Main01

fun main(){
    val raio = Circulo(5.0)
    raio.calcCircunferencia()
}

class Circulo(var raio: Double){

    companion object {
        const val pi = 3.14159
    }

    fun calcCircunferencia() {
        val formula = 2 * pi * raio
        println("A circufenrencia do circulo com raio $raio é $formula")
    }
}