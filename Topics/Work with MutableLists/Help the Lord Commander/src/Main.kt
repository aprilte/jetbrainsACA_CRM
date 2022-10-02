fun main() {  
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()   
    // do not touch the lines above
    // write your code here
    println(contains(beyondTheWall, backToTheWall))
}

fun contains(listA: MutableList<String>, listB: MutableList<String>): Boolean {
    var ret: Boolean = true
    listA.forEach {
        if (ret) {
            ret = listB.contains(it)
        }
    }

    return ret
}