fun main() {
    val carro1 = Carro()
    carro1.marca = "Hyundai"
    carro1.modelo = "hb20"
    carro1.acelerar()

    val carro2 = Carro()
    carro2.marca = "Honda"
    carro2.modelo = "HR-V"
    carro2.acelerar()
}

class Carro {
    var marca: String = ""
    var modelo: String = ""
    var cor: String = ""

    fun acelerar() {
        println("O carro da marca $marca, modelo $modelo está acelerando...")
    }

}