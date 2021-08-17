fun main(args: Array<String>) {
    var name = "laymui";
    val surname = "toh"

    println("Hello, My name is " + name);

    name = "tirzah"

    println("Hello, My name is now " + name);

    var firstName: String = "I am immutable"

    println("firstName " + firstName);

   // firstName[3] = "e";  // not allowed

    firstName = "I can change the entire string"

    println("firstName is now " + firstName);

    // String Template
    var fname: String = "Toh Lay Mui"
    var empnum: String = "P1332967"

    val toHR = "Employee number of $fname is $empnum"

    println(toHR)

    var x = 10
    var y = 15

    println("$x + $y = ${x + y}")

    var product1: String = "Berry Beat "
    var product2: String = "Rosytime"

    var addItems = product1.plus(product2)

    println("My order for this month: " + addItems)

    // Kotlin if and when
    // this demo that in if statement the last expression is the value
    var z = if (x == y) {
        println("equal")
        x
    } else {
        println("not equal")
        y
    }

    println("Value of z: " + z)

    // Type checking
    // Any? the ? allow us to nullify the variable myval
    var myval: Any? = ""
    if (myval is String) {
        println("This is a string")
    }
    else {
        println("This is not a string")
    }

    myval = 15
    if (myval !is Int) {
        println("this is not a Int")
    }
    else {
        println("this is a Int")
    }

    myval = null
    println(myval)

    // Range with in

    var a:Int = 5
    var b:Int = 10

    if (a in 1..b) {
        println("in range")
    }


}