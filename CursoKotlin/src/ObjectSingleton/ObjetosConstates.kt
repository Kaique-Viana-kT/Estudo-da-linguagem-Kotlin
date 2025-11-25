package ObjectSingleton

fun main(){
    if(Constates.DOMAIN > "https://google.com"){
        println("1")
    }else{
        println("1")
    }

    if(Constates.MAX_NAME_LENGTH > 10){
        println("1")
    }else{
        println("1")
    }
}

object Constates{
    const val MAX_NAME_LENGTH = 8
    const val DOMAIN = "https://exemplo.com"
    const val PHOTO_EXT = ".jpg"
    const val IMAGE_PATH = "/Images/"
}