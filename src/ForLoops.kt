fun main(args: Array<String>) {
    // For loops via range
    val count = 10
    var current = 0

    for (i in 1..count) {
        current += 1

        println(current)
    }

    // Repeat loop - very nice
    repeat(10) {
        current += 1

        println(current)
    }

    // For loop with a "step"
    for (i in 1..10 step 2) {
        println(i)
    }

    // "continue" via multiplication table of odd rows only
    for (row in 1 until 8) {
        if (row % 2 == 0) {
            continue
        }

        for (column in 1 until 8) {
            val sum = row * column
            println(sum)
        }

        println()
    }

    // Challenge
    for (row in 0 .. 7) {
        for (column in 0..7) {

            if (column > (row - 1)) {
                continue
            }

            val sum = row * column

            print("$sum ")
        }

        println()
    }

    // "rowLoop@" and "columnLoop@" are called labels. Then can also be attached to an array.
    var sum = 0
    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8) {
            if (row == column) {
                // Break @ specific loop
                // break@rowLoop
                continue@rowLoop
            }
            sum += row * column
        }
    }


}