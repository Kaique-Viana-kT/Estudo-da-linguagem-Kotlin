package ProgramaçãoFuncional

fun main(){
//    val verdadeiro: Any = true
//    val inteiro: Any = 10
//
//    println(verdadeiro::class)
//    println(inteiro::class)
//
//    val obj: Any = getObject(2)

//    if(obj is String){
//        println(obj.length)
//    }else println("Esse objeto não é uma string")

    //transformando o obj em string
//    val cast = obj as String
//    println(cast.length)

//    val cast = obj as? String
//    if(cast != null) println(cast.length)

//    val cast = obj as String
//    println(cast.length)

    //divide(10,5)

//    divide2("xx", "5")

    showView()

}

//fun divide(x: Int, y: Int){
//    try{
//        println(x/y)
//    } catch (e: ArithmeticException){
//        println("divisão por 0 invalida")
//    }
//}

//fun divide2(x: String, y: String){
//    try{
//        val a = Integer.parseInt(x)
//        val b = Integer.parseInt(y)
//        println(a/b)
//    }catch(e: NumberFormatException){
//        println(e.message)
//    }catch(e: ArithmeticException){
//        println("divisão por 0 invalida")
//    }
//}

fun showView(){
    try{
        val res = applyDiscount(100.0, 51)
        println(res)
    }catch(e: IllegalArgumentException){
        println(e.message)
    }
}

fun applyDiscount(price: Double, value: Int) : Double{

    if(value > 50) throw IllegalArgumentException("desconto muito alto")

    val discount = value * price / 100
    return price - discount
}

fun getObject(value: Int): Any{
    return when(value){
        1 -> 1
        2 -> "Aula"
        3 -> true
        else -> 1.0
    }
}