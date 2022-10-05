fun intDivision(x: String, y: String): Int {
    var ret: Int = 0
    try {
        ret = x.toInt() / y.toInt()
    } catch (ex: Exception) {
        when (ex) {
            is ArithmeticException, -> println("Exception: division by zero!")
            is NumberFormatException, -> println("Read values are not integers.")
            else -> println("something went wrong.")
        }
    } finally {

    }
    return ret
}

fun main() {

    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}