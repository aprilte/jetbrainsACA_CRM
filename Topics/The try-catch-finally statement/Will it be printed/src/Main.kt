// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    division()
}
fun division() {
    var a = 0
    try {
        a = 44 / 0
        println("The try block is executed")
    }
    catch (e: NumberFormatException) {
        println("The catch block is executed")
    }
    finally {
        println("The finally block is executed")
    }
}
