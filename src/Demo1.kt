/*
*  Kotlin: OOP + FP
*
* Debido a que es funcional, soporta funciones de orden superior (lambdas)
*       - almacenar fuciones en colecciones
*       - pasar funciones como parámetros
* */
fun main(args: Array<String>) {

    val numero = 4
    numero.methodExtension()
}

fun Int.methodExtension() {
    println("This number is $this")
}

fun Int?.nullableMmethodExtension() {
    println("This nullable number is $this")
}