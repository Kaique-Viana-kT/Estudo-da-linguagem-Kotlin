package Modulo4

fun main(){
    val controller = PS4Controller()
    println(controller.getInfo())

    controller.Triangulo.press()
    controller.Circulo.press()
    controller.Cruz.press()

}

 class PS4Controller{

     class Button(val name: String){
         fun press(){
             println("BOTAO PRESSIONADO: $name")
         }
     }

     val Triangulo = Button("Triangulo")
     val Quadrado = Button("Quadrado")
     val Circulo = Button("Circulo ")
     val Cruz = Button("Cruz")
     val L1 = Button("L1")
     val R1 = Button("R1")

     fun getInfo(): String{
         return "PS4 Controller com ${Triangulo.name}, ${Circulo.name}, ${Cruz.name}, ${Quadrado.name}, ${L1.name}, ${R1.name}"
     }

 }