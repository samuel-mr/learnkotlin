import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

fun main(args: Array<String>) {
    for(i in 0..1){
        println(i)
    }
    print(multiplo(2.0,3.0))
    val arreglo = listOf(1, 2, 3)
    var nuevo = mutableListOf<Int>()

    arreglo.forEachIndexed { i, j ->
        {
            nuevo[i] = j
            nuevo[arreglo.size + i] = j
        }

    }
    println(nuevo)
}

fun multiplo(x: Double, y : Double) = x * y
