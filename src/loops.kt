fun main(args: Array<String>) {

    var x: Int = 1

    while (x < 5) {
        x += 1

        println(x)
    }

    // Do-while
    // Difference of while?
    // it executes first BEFORE checking the condition

    var y = 10

    do {
        // Still runs even because the condition below prevents it
        // but it cant - because it's below, hence the concept of do-while

        y++

        println("y: $y")
    } while(y < 5)

    // Break out of the loop
    var z: Int = 1

    while (z < 5) {
        z += 1

        println(z)

        if (z == 3) {
            println("Breaking Free")
            break
        }
    }

    // Challenges.
    val firstName = "Dick"

    if (firstName == "Dick") {
        val lastName = "Lucas"
    } else if (firstName == "Ray") {
        val lastName = "Wenderlich"
    }

    // What's wrong is that you cannot declare variables inside IF statements
    // and expect them to persist outside the IF.
    // val fullName = firstName + " " + lastName

    // Chess board problem
    // Next position.
    // Need multi array? Nah
    val chessX = 5
    val chessY = 5

    // Calculate position from 0-63
    fun calculateChessPosition(position: Pair<Int, Int>) {
        var xCoordinate = position.first
        var yCoordinate = position.second

        var found: Boolean = false


        var yCoordinateTranslate = yCoordinate * 8
        var currentPosition = 1

        println("yCoordinateTranslate: $yCoordinateTranslate")

        while(found == false) {
            println("in here")

            while (currentPosition < yCoordinateTranslate) {
                println("Multiply")
                currentPosition = currentPosition + 8
            }

            break
        }

        println("xCoordinate: $xCoordinate")
        println("yCoordinate: $yCoordinate")

        println("currentPosition: $currentPosition")

        println("Current position: ${currentPosition - (9 - xCoordinate)}")

    }

    calculateChessPosition(Pair(1,1))
    calculateChessPosition(Pair(1,2))
    calculateChessPosition(Pair(3,2))

    // I choose not to do the other algorithmic problems for now.
}