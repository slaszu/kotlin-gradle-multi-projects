package pl.slaszu.app

fun main() {
    println("app-cli >> Hello World!")

    val testFromShared = pl.slaszu.shared.Test()
    testFromShared.run()

//    val test2 = pl.slaszu.shared.Test2()
//    test2.run()
}