package Modulo4

fun main(){
    val gps = GPS(37.334606, -122.009102)

    val(latitude,logitude) = gps
    println("Apple Park Location -> Latitude: $latitude, Longitude: $logitude")
}

data class GPS(var latitude: Double, var longitude: Double){

}