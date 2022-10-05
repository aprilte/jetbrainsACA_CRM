import kotlin.Exception

fun main() {
    val answer : Int =
        try {
            readLine()!!.toInt()
        } catch (ex: Exception) {
            42
        } finally {
            42
        }
    println("The answer is a number")
    println(answer)
}