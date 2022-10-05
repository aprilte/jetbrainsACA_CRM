fun main() {
    // put your code here
    println(findx(readln().toDouble(), readln().toDouble(), readln().toDouble()))
}

fun findx(a: Double, b:Double, c:Double): Double {
    return (c - b) / a
}