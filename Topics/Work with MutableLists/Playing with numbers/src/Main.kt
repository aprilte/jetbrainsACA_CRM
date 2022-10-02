fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here   
    var summ = 0
    numbers.forEach {
        summ += it
    }
    for (i in numbers.lastIndex - 1 downTo 1) {
        numbers[i] = numbers[i-1]
    }
    numbers[0] = summ
    // do not touch the lines below
    println(numbers.joinToString(" "))
}