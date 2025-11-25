package ObjectSingleton

fun main(){
    val userA = User("Kaique")
    println(Database.name)
    println(Database.userLogget?.name)

    login(userA)
    println(Database.userLogget?.name)

    val userB = User("Bruce")
    login(userB)
    println(Database.userLogget?.name)
}

fun  login(user: User){
    Database.userLogget = user
}