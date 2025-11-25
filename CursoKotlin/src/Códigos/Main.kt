//GLOSSARIO: var, val, fun, class, Double, String, Int, true, false
fun main() {
   var name = "Kaique" //mutavel
    name = "Rodrigo"
    println(name)

    val name2 = "kaique" //imutavel
    //name2 = "Goger"
    println(name2)

    var resultado = 1+1
    println(resultado)
    //todo: preciso estudar mais kotlin

    var price = 31.90
    var name3: String = "Gege" //TIPO INFERIDO
    var idade = 30
    println(price::class)
    println(name3::class)
    println(idade::class)

    var byte: Byte = 8
    var int: Int = 32
    var short: Short = 16
    var long: Long = 64L
    println(byte::class)
    println(int::class)
    println(short::class)
    println(long::class)

}