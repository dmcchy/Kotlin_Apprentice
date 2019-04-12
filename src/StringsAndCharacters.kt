fun main(args: Array<String>) {
    var oneChar: Char = 'a'
    val oneString: String = "Demby"

    // Having kotlin infer the type as string
    val inferredString = "Genesis"

    // So, we are able to concat a character to a string directly.
    var concatenated: String = oneChar + " " + oneString

    println(concatenated)

    // Shorthand concatenation.
    concatenated += inferredString

    println(concatenated)

    println(oneChar)
    println(oneString)
    println(inferredString)

    /**
     * I learned that variable & const declarations are written like:
     * var NAME_OF_VARIABLE: PRIMITIVE_TYPE = VALUE
     * var myString: String = "Demby"
     */

    // String templates
    var stringTemplate = "Hello, my name is $oneString $inferredString"

    println(stringTemplate)

    val myDoubleVariable: Double = 0.033330132

    // You can also print out stringTemplates with other primitive types.
    val stringTemplateWithStringAndDouble = "Hello, my name is $oneString $inferredString - and my favourite number is: $myDoubleVariable"

    println(stringTemplateWithStringAndDouble)

    // You can also put operations/expressions inside a string literal via:
    val expressionInStringLiteral: String = "Hello, my age is ${20 + 6}"
    println(expressionInStringLiteral)

    /**
     * Multi-line Strings!
     * | - is a pipe character, which can be gauge of the spaces in your string spread across multiple lines
     */
    var myMultiLinedString = """
        |A line
        | A line
        |  A line
        |   A line
        |   A line
        |  A line
        | A line
        |A line
        """.trimMargin()

    println(myMultiLinedString)

    /**
     * Mini Exercises!
     *
     * 1. Create a string constant called firstName and initialize it to your first name.
     *    Also create a string constant called lastName and initialize it to your last name.
     *
     * 2. Create a string constant called fullName by adding the firstName and lastName constants together,
     *    separated by a space.
     *
     * 3. Using string templates, create a string constant called myDetails that uses the fullName
     *    constant to create a string introducing yourself. For example, my string would read: "Hello, my name is Dick Lucas.".
     */

    var firstName: String = "Demby"
    var lastName: String = "Abella"

    val fullName: String = firstName + " " + lastName

    val introduction: String = "Hello, namaywa: ${fullName}"

    println(introduction)
}