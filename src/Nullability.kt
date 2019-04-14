fun main(args: Array<String>) {
    // null is a like an empty box - yes, there is a box!
    // But it is empty.


    var nullable: Int? = 10

    // you cannot add Ints to an Int that can be nullable
    // println(nullable + 1)


    // How can you remove these nullables so you can add them? via:
    println(nullable!! + 1)
}