fun main(args: Array<String>) {
    fun printMyName() {
        println("My name is Demby")
    }

    printMyName()

    fun printMyParameterizedName(name: String) {
        println("Hello, my name is $name")
    }

    println(printMyParameterizedName("Zelda"))


    // Function with return
    fun getSum(x: Int, y: Int) : Int {
        return x + y
    }

    println("I have the sum of 5 and 3 as: ${getSum(5, 3)}")


    fun getQuotientAndProduct(x: Int, y: Int): Pair<Int, Int> {
        return Pair(
            x / y,
            x * y
        )
    }


    println("Quotient and product of 5 and 5: ")
    println(getQuotientAndProduct(5, 5))

    // Note: You CANNOT modify a value passed inside a function,
    // however, you may do this indirectly by creating a new function

    // You can "overload" functions - meaning you are able to create
    // 2 or more functions with the same name.
    // However it's distinction must be it's parameters accepted, see below:

    fun call() {
        println("I am a calling an unknown person...")
    }

    fun call(name: String) {
        println("I am a calling $name...")
    }

    call()
    call("Demby")

    // Functions are just another data type and thus can be
    // stored in variables.

    fun addTwoNumbers(x: Int, y: Int): Int {
        return x + y
    }

    var myOwnFunction = ::addTwoNumbers

    println("Adding 5 and 6 yields: ${addTwoNumbers(5,6)}")

    // "Wow" You can also pass functions to args
    fun functionPassingExample(
        function: (Int, Int) -> Int,
        a: Int,
        b: Int
    ): Int {
        return function(a,b)
    }

    var result = functionPassingExample(myOwnFunction, 3, 3)

    println("Result is: $result")

    // Functions that will NEVER exit return anything should be identified by ": Nothing"
    // so the compiler will be able to make optimizations
    // fun cronServuce(): Nothing {}

    // Writing good functions:
    // 1. Must only do 1 simple Task (ease of testability)
    // 2. Has well defined set of inputs that produce the same outputs "every time"

    // Challenges
    // 1. Determine if a number is prime or not
    // 2. Write a fibonacci sequence
}