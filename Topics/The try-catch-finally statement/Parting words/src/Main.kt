import java.lang.Exception

fun pepTalk(name: String) : String {
    val array = name.split(" ").toTypedArray()
    var msg: String =""
    println("Good luck!")
    try {
        val firstName = array[0]
        val secondName = array[1]
        msg = "Don't lose the towel, traveler $firstName $secondName!"
    } catch (ex: Exception) {
        msg = "Don't lose the towel, nameless one."
    }
    return msg
}   
// do not change the function above        

fun main() {
    val name = readLine()!!
    val advice = pepTalk(name) // fix this function call
    print(advice)        
}