//This simple code lists the arry

import java.util.*
fun main(args: Array<String>) {
    val array = arrayOf("a", "b")
    val list = Array.toList(*array)
    println(list)
}
