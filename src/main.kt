fun main(){
    val a = 10.0
    val b = 15.0

    println("${a}+${b}=${a+b}")
    println("${a}-${b}=${a-b}")

    dodaj(10.0,10.0)
}

fun dodaj(a: Double, b:Double):Double{
    return a+b;
}