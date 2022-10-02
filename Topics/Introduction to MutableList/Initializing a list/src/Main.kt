fun main() {
    val numbers = List(100){
        if (it == 0) 1
        else if (it == 9) 10
        else if (it == 99) 100
        else 0
    }// put your code here

    // do not touch the lines below 
    println(numbers.joinToString())
}