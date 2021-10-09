fun main(args: Array<String>) {

    // Lista Set (solo admite valores únicos)
    val num = mutableSetOf(1, 2, 3)

    num.add(4) //[1, 2, 3, 4]
    num.add(4) // not added (only unique)
    num.remove(4) // [1, 2, 3]
    println(num)
}