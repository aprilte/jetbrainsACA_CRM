package cinema

fun main() {
    // write your code here
    println("Enter the number of rows:")
    val row = readln().toInt()
    println("Enter the number of seats in each row:")
    val col = readln().toInt()

    var MyCinema = MiniCinema(row, col)
    while (!MyCinema.closed) {
        MyCinema.reception()
    }

}

class MiniCinema (val row: Int, val col: Int) {
    var totalSeats: Int = 0
    var frontHalf: Int = 0
    var backHalf: Int = 0
    val boundOfLarge: Int = 60
    var largeCinema: Boolean = false
    var closed: Boolean = false
    val seatStat = Array(row, { Array(col, {0}) }).toMutableList()

    init {
        totalSeats = row * col
        frontHalf = ( row / 2 ) * col
        backHalf = totalSeats - frontHalf
        if(boundOfLarge < totalSeats) largeCinema = true
    }

    fun reception() {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")
        val orderQ = readln().toInt()
        when (orderQ) {
            0, -> closed = true
            1, -> printSeatTable()
            2, -> book()
        }
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
        //issue::when col count is 10 or more, seat table style will be adjusted
        for (i in 1..this.row) {
            print("$i ")
            for (j in 1..this.col) {
                if (seatStat[i-1][j-1] != 0) {
                    print("B ")//booked
                } else {
                    print("S ")//seat available
                }
                if (j == this.col) println()
            }
        }
        //eos
        println()
    }

    fun book() {
        println("Enter a row number:")
        val bRow = readln().toInt()
        println("Enter a seat Number in that row:")
        val bCol = readln().toInt()
        //seat num check
        if (this.row < bRow) {
            println("out of seat table")
            return
        }
        if (this.col < bCol) {
            println("out of seat table")
            return
        }
        //seat status update
        seatStat[bRow-1][bCol-1] += 1
        //price print
        if (!largeCinema) {
            println("Ticket price: $10")
        } else {
            println("Ticket price:" +
                if (bRow <= this.row / 2) {
                    "$10"
                } else {
                    "$8"
                }
           )
        }
    }

}