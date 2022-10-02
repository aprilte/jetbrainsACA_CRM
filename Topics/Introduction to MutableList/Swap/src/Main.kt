fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val copy = numbers.toList()// val copy = numbers にするとcopyがnumbersを参照するだけになる
    numbers[0] = copy[numbers.lastIndex]
    numbers[numbers.lastIndex] = copy[0]

//    for (i in 0..numbers.lastIndex) {
//        numbers[i] = copy[numbers.lastIndex - i]
//    }
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}