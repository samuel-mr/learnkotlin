fun main(args: Array<String>) {
    // Lista Set : solo admite valores únicos, los repetidos los exceptuará
    var lista = setOf(1, 2, 3)
    lista.size // 3

    lista.forEach { it }
    // 1
    // 2
    // 3

    lista.contains(2) // true
    lista.isEmpty() // false
    lista.toString() // [1, 2, 3]

    // PROCESSING
    lista.any { it > 1 } // true -> true if at least one element match predicate
    lista.none { it > 10 } // false -> true if NO elements match predicate
    lista.all { it > 2 } // false -> true if all element match predicate

    lista.average() // 2.0
    lista.sum() // 6

    lista.filter { it > 1 } // [2, 3]
    lista.filter { it % 2 == 1 } // [1, 3] -> impares
    lista.sortedDescending() // [3, 2, 1]
    lista.take(2) // [1, 2] -> first 2
    lista.map { it * 2 } // [2, 4, 6] -> transfor
    //println(lista.flatMap { listOf(it)}) // [1, 11, 2, 12, 3, 13]
    lista.flatMap { listOf(it, it + 10) } // [1, 11, 2, 12, 3, 13] -> join lists

    lista.first() // 1
    lista.first { it > 1 } // 2
    lista.last() // 3
    lista.last { it < 3 } // 2
    val palabras = listOf("uno", "dos")

    listOf(lista, palabras) // [[1, 2, 3], [uno, dos]] -> list of 2 arrays
    listOf(lista, palabras).flatMap { it } // [1, 2, 3, uno, dos] -> combine many lists in one list
}
