fun main() {
    // write your code here
    val counter = readln().toInt()
    val companiIncome = List(counter) { readln().toInt() }
    val companiTaxPerc = List(counter) { readln().toInt() }
    val taxie = List(counter) { 0 }.toMutableList()
    for (i in 0..companiIncome.lastIndex) {
        taxie[i] = companiIncome[i] * companiTaxPerc[i]
    }
    var index = 0
    var max = 0
    for (i in 0..taxie.lastIndex) {
        if (max < taxie[i]) {
            max = taxie[i]
            index = i
        }
    }
    println(index + 1)
}