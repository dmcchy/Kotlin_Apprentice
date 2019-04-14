fun main(args: Array<String>) {
    // The interesting "when" expression
    val number = 10

    when (number) {
        0 -> println("Zero")
        else -> println("non Zero")
    }

    val animal: String = "Venom"

    when (animal) {
        "Cat", "Dog" -> println("I am a cat or dog")
        "Venom" -> println("I am a symbiote")
    }

    val num = 322

    // This when statement is "exhaustive" because it is supposed to be returned
    val numberName = when (num) {
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> {
            println("I dont know you")
            "ss"
            "gogogogo" // the last variable is returned
        }
    }

    println(numberName)

    // ADVANCED when expressions in practice
    val hourOfDay = 12
    val timeOfDay: String
    timeOfDay = when (hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9, 10, 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)


    // Another example
    val x = 0
    val y = 0
    val z = 0

    // 3d Polygon
    when {
        x == 0 && y == 0 && z == 0 -> println("Origin")
        y == 0 && z == 0 -> println("On the x-axis at x = $x")
        x == 0 && z == 0 -> println("On the y-axis at y = $y")
        x == 0 && y == 0 -> println("On the z-axis at z = $z")
        else -> println("Somewhere in space at x = $x, y = $y, z = $z")
    }

}