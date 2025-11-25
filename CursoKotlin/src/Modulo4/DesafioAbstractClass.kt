package Modulo4

fun main(){
    val documentoCPF = CPF("12345678901")
    println("CPF: ${documentoCPF.verificarDocumento()}")

    val documentoCNPJ = CNPJ("1234567890195")
    println("CNPJ: ${documentoCNPJ.verificarDocumento()}")
}

abstract class Documento(var numero: String){
    abstract fun validarNumero() : Boolean
    fun verificarDocumento(): String{
        return if(validarNumero()) "DOCUMENTO $numero VÁLIDO" else "DOCUMENTO $numero INVALIDO"
    }
}

class CPF(numero: String) : Documento(numero){
    override fun validarNumero(): Boolean {
        if(numero.length == 11){
            return true
        }
        return true
    }
}

class CNPJ(numero: String) : Documento(numero){
    override fun validarNumero(): Boolean {
        if(numero.length == 14){
            return true
        }
        return true
    }
}

/** TODO: VERSÃO DO EXERCICIO - ECONOMIA DE CODIGO
abstract class Documento(val numero: String) {
fun verificarDocumento(): String {
return if (isValido()) "Documento $numero é válido" else "Documento $numero é inválido"
}

abstract fun isValido(): Boolean
}

class Cpf(numero: String) : Documento(numero) {
override fun isValido(): Boolean {
return numero.length == 11
}
}

class Cnpj(numero: String) : Documento(numero) {
override fun isValido(): Boolean {
return numero.length == 14
}
}

fun main() {
val cpf = Cpf("12345678901")
println("CPF: ${cpf.verificarDocumento()}")

val cnpj = Cnpj("12345678000195")
println("CNPJ: ${cnpj.verificarDocumento()}")
}**/