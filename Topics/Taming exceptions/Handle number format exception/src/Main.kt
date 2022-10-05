import java.lang.Exception

fun parseCardNumber(cardNumber: String): Long {
    // TODO
    val part = cardNumber.split(" ")
    part.forEach {
        if(it.length != 4) throw Exception("block size does not match")
    }
    if( cardNumber.length != 19 ) {
        throw Exception("total length error")
    }
    var str = cardNumber.replace(" ".toRegex(), "")
//    while (str.first() == '0') {
//        println(str)
//        str = str.drop(1)
//    }
    try {
        return str.toLong()
    } catch (ex: Exception) {
        throw Exception(ex)
    }

}
//
//fun main(){
//    val read = readln()
//    println(parseCardNumber(read))
//}