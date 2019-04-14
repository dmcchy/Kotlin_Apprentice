fun main(args: Array<String>) {
    // closed Range of elements: (0,1,2,3,4,5)
    var closedRange = 0..5


    // Range goes up to, but not including 5 - so: (0,1,2,3,4)
    var openRange = 0 until 5

    println(closedRange)


    // Decreasing range (inclusive): (5,4,3,2,1,0)
    var decreasingRange = 5 downTo 0


}