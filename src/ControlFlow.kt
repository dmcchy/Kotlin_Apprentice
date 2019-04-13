fun main (args: Array<String>) {
    var yes: Boolean = true
    var no: Boolean = false

    // A thing to remember is that we don't
    // use === (tripe equality checks) anymore
    // as this isn't a loose language like
    // PHP or JS.
    var doesOneEqualTwo = (1 == 2)
    var doesOneNotEqualTwo = (1 != 2)
    var doesNotOneEqualTwo = !(1 == 2)

    var oneGreaterOrEqualToTwo = (1 >= 2)
    var oneLesserOrEqualToTwo = (1 <= 2)

    println(doesOneEqualTwo)
    println(doesOneNotEqualTwo)
    println(doesNotOneEqualTwo)

    println(oneGreaterOrEqualToTwo)
    println(oneLesserOrEqualToTwo)

    // Combining Boolean operators - the works.
    var A: Boolean = true
    var B: Boolean = false

    var aAndB: Boolean = A && B
    var aOrB: Boolean = A || B

    // String equality

    val myAge = 26
    val isTeenager = (myAge >= 13) && (myAge <= 19)

    println("isTeenager: $isTeenager")

    val theirAge = 30
    val boothTeenagers = (myAge >= 13) && (myAge <= 19)
            && (theirAge >= 13) && (theirAge <= 19)

    println("boothTeenagers: $boothTeenagers")
}