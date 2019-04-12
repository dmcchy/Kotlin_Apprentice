fun main(args: Array<String>) {
    /**
     * Here, I will strive to understand Pairs and Triples in Kotlin...
     */

    // Pair - perfect for plotting out 2D coordinates.
    var coordinates: Pair<Int, Int> = Pair(2,3)

    // Inferred pair.
    var inferredCoordPair = Pair(2,3)

    // Mixed Pair
    var doubleAndIntPair: Pair<Double, Int> = Pair(2.3, 3)

    var inferredDoubleAndIntPair = Pair(2.3, 3)

    println(coordinates)
    println(inferredCoordPair)
    println(doubleAndIntPair)
    println(inferredDoubleAndIntPair)

    // How to access data inside a Pair.
    val firstPairValue = inferredDoubleAndIntPair.first
    val secondPairValue = inferredDoubleAndIntPair.second

    println("Accessing first and second values in inferredPair respectively")
    println(Pair(firstPairValue, secondPairValue))

    // Destructing pairs
    val (firstPair, secondPair) = inferredDoubleAndIntPair

    println("Destructuring pair values: ")
    println(firstPair)
    println(secondPair)

    /**
     * Mini exercises
     * 1. Declare a constant Triple that contains three Int values. Use this to represent a date (month, day, year).
     *
     * 2. Extract the values in the triple into three constants named month, day and year.
     *
     * 3. In one line, read the month and year values into two constants. You’ll need to employ the underscore to ignore the day.
     *
     * 4. Since the values inside Pairs and Triples cannot be modified, you will need to extract the values from them,
     *
     *    make any modifications you want, and then create a new Pair or Triple. Using the values you extracted in step three,
     *
     *    modify the month value and create a new Pair containing the modified month along with the unmodified year.
     */

    var date: Triple<Int, Int, Int> = Triple(10, 11, 1992)

    var (month, day, year) = date

    month = month + 1
    day = day + 1
    year = year + 1

    println(month)
    println(day)
    println(year)

    var newDate: Triple<Int, Int, Int> = Triple(month, day, year)

    println(newDate)
}