fun main(args: Array<String>) {
    var numero: Int = 2
    println(numero.sumate(3)) // 5
    println(numero sumon 4 * 2) // 10
    println(multiply(2.0,3.0)) //6
}

// Extensión: función normal
fun Int.sumate(numero: Int): Int {
    return this + numero
}

// infix permite evitar poner el punto y los paréntis, solo permite 1 parámetro
infix fun Int.sumon(num: Int): Int {
    return this + num
}

fun multiply(x: Double, y: Double) = x * y

