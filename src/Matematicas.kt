import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

fun main(args: Array<String>) {

    println(sqrt(2f))

    //valor= 0.017453292519943295
    val constToConvertRadians = Math.PI / 180

//    println("cos: ${cos(90.0f * constToConvertRadians)}") //6.123233995736766E-17 ... must be 0 !
//    println("cos: ${cos(Math.toRadians(90.1))}") //6.123233995736766E-17 ... must be 0 !

    // (x ; y) = cos(angulo), sen(angulo)
    val radio = 100
    for (i in 1..90) {
        val seno = sin(Math.toRadians(i.toDouble())) * radio
        val coseno = cos(Math.toRadians(i.toDouble())) * radio
        println("i=${i} x=${coseno} y=${seno}")
    }

}

