import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun main(args: Array<String>) {

    MyColors.all.forEach {
        println(it)
    }
}

class DumbColorGetter(val value: Long) : ReadOnlyProperty<MyColors, Long> {
    override operator fun getValue(thisRef: MyColors, property: KProperty<*>): Long = value
}

object MyColors {

    private val _allNames = mutableListOf<String>()
    val all get() = _allNames

    class NamedColor(val value: Long) {
        operator fun provideDelegate(thisRef: MyColors, prop: KProperty<*>): ReadOnlyProperty<MyColors, Long> {
            _allNames.add(prop.name)
            return DumbColorGetter(value)
        }
    }

    val red_blood by NamedColor(0xFFb92b27)
    val red_orange by NamedColor(0xFFb12b11)
}