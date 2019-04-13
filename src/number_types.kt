fun main(args: Array<String>) {
    // Number types.
    val a: Short = 12
    val b: Byte = 120
    val c: Int = -100000
    val answer = a + b + c // Answer will be an Int

    // kotlin can declare both int and string as any

    var anyInt : Any = 43
    var anyString : Any = "43"

    // This function, which does not return anything - returns a
    // "Unit".
    fun add() {
        var result = 2 + 2
        println(result)
    }

    fun add2() : Unit {
        var result = 2 + 2
        println(result)
    }

    // "Nothing" can be declared in a function that does not return
    // anything or does not terminate.
    fun doNothingForever(): Nothing {
        while (true) {
            // Just stay awhile, and listen
        }
    }

    /**
     *
     * • Type conversion allows you to convert values of one type into another.
     *
     * • Kotlin will convert types for you when using an operator, such as the basic arithmetic
     *   operators (+, -, *, /), with mixed types.
     *
     * • Type inference allows you to omit the type when Kotlin already knows it.
     *
     * • Unicode is the standard for mapping characters to numbers.
     *
     * • A single mapping in Unicode is called a code point.
     *
     * • The Character data type stores single characters.
     *   The String data type stores collections of characters, or strings.
     *
     * • You can combine strings by using the addition operator.
     *
     * • You can use string templates to build a string in-place.
     *
     * • You can use Pairs and Triples to group data into a single data type.
     *
     * • There are many kinds of numeric types with different storage and precision capabilities.
     *
     * • Any is the mother of all non-nullable types, Unit is kind of like void in Java, and Nothing is well, nothing.
     *
     *
     */

    // Challenges.
    val coordinates : Pair<Int, Int> = Pair(2, 3)

    var (row, column)  = coordinates

    println(row)
    println(column)

    val date = Triple(15, 8, 2015)
    val day = date.first

    println(day)

}