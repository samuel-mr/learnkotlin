fun main(args: Array<String>) {
    ejemplo2()
}

fun ejemplo2() {
    // for inclusive
    for (i in 0..1) {
        println(i)
    } // {0 1}

    // for exclusivo
    for (i in 0 until 2) {
        println(i)
    } // {0 1}


}

fun ejemplo1() {
    var lista = listOf("uno", "dos", "tres", "cuadro")

    val itemsToShow = 3
    var i = 0
    while (i < lista.size) {
        println(lista.subList(i, if ((i + itemsToShow) > lista.size) lista.size else i + itemsToShow))
        i = i + itemsToShow
    }
}