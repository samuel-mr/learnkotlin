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

    val numeroNull: Int? = null
    numeroNull.nullableMethodExtension()
}

fun Int.methodExtension() {
    println("El numero es $this")
}

fun Int?.nullableMethodExtension() {
    if (this == null) {
        println("Numero nulo!")
    } else {
        println("El numero nuleable es $this")
    }
}