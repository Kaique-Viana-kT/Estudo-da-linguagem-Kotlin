fun main(){
    //bit menor unidade de medida de dados
    //byte é um conjunto de 8-bits

    var byte: Byte = 8        //8-bit
    var int: Int = 32         //32-bit
    var short: Short = 16     //16-bit
    var long: Long = 64       //64-bit
    var double: Double = 31.09//64-bit
    var float: Float = 18.0f  //32-bit

    println(byte::class)
    println(int::class)
    println(short::class)
    println(long::class)
    println(double::class)
    println(float::class)

    var char: Char = 't'
    println(char::class)

    //(verdadeiro/falso)  true/false 
    val boolean: Boolean = true
    println(boolean::class)

}