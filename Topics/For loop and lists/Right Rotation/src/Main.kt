fun main() {
    // write your code here
    val rotater = TheList(readln().toInt())
    rotater.rotate()
    rotater.printx()
}

class TheList(size: Int) {
    val myList = List(size) { 0 }.toMutableList()
    var rotater: Int = 0
    init {
        for (i in 0..size - 1) {
            myList[i] = readln().toInt()
        }
        rotater = readln().toInt() % size
    }

    fun rotate() {
        val copy = myList.toList()
        val rest = rotater

        for (i in 0..myList.lastIndex) {
            myList[i] =
                if (i - rotater < 0) {
                    copy[copy.size + (i - rotater)]
                } else {
                    copy[i - rotater]
                }
        }
    }

    fun printx() {
        myList.forEach { print("$it ") }
        println("")
    }
}