package pl.slaszu.shared

fun main() {
    println("shared >> Hello World!")
}

class Test() {
    fun run() {
        println("test from shared")
    }
}

internal class Test2 {
    fun run() {
        println("test2 from shared")
    }
}