package cinema

fun main() {
    // write your code here
    var MyCinema = MiniCinema()
    //MyCinema.printSeatTable()
    MyCinema.printTotalIncome()
}

class MiniCinema {
    var row: Int = 0
    var col: Int = 0
    var totalSeats: Int = 0
    var frontHalf: Int = 0
    var backHalf: Int = 0
    val boundOfLarge: Int = 60

    init {
        println("Enter the number of rows:")
        row = readln().toInt()
        println("Enter the number of seats in each row:")
        col = readln().toInt()
        totalSeats = row * col
        frontHalf = ( row / 2 ) * col
        backHalf = totalSeats - frontHalf
    }

    fun printTotalIncome() {
        println("Total income:")
        if (totalSeats < boundOfLarge) {
            println("$${10 * totalSeats}")
        } else {
            println("$${10 * frontHalf + 8 * backHalf}")
        }
    }

    fun printSeatTable() {
        println("Cinema:")
        //print cols
        print("  ")
        for (i in 1..this.col) {
            print("$i ")
            if (i == this.col) println()
        }

        //print each row
        for (i in 1..this.row) {
            print("$i ")
            for (j in 1..this.col) {
                print("S ")
                if (j == this.col) println()
            }
        }

    }

}