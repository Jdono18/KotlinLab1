/*
* Instructions
*
* Make a copy of this code in a new scratch file.
*
* Read the code provided
*
* Follow the instructions in the TODO
* messages and add code, or comments, as instructed
*
* You will not modify the code provided unless the instruction tells you to.
*
* To submit: Either create a Gist and submit the link to the Gist file https://gist.github.com/
* Or, submit your kotlin scratch file.
*
* * */


/** Variables **/

val product = "Graphics Card"
println(product)

var quantity = 10
quantity = 20

// TODO create a new constant value to store the manufacturer. Set the value to "NVIDIA"
val manufacturer = "NVIDIA"
// TODO create a new variable to store the price. Set the price to 234.56, which is a number of dollars.
var price = 234.56

// TODO write a comment and explain why the following line is an error
//product = "Motherboard"

// the product is not defined as a constant value or a variable using val or var.  It must first be created.

// TODO write a comment and explain why the following line is an error
//product = null

// the product is not defined using var or val

// TODO print a message, using the variables declared above, and template string
//  "The product name is Graphics Card, the manufacturer is NVIDIA, the quantity available is 20, and the price each is $234.56"

println("The product name is $product, the manufacturer is $manufacturer, the quantity available is $quantity, and the price of each is $$price")



/** Conditional Code **/

// use the variables declared above.

// TODO write an if-else statement to print the message "Graphics cards are available" if the quantity
//  variable is 1 or more.
//  Else, print the message "No graphics cards available".
//  You may change the value of the quantity variable to test your code.

if (quantity >= 1) {
    println("${product}s are available.")
} else {
    println("No ${product}s available.")
}


// Graphic card prices are divided into three categories.
// Graphics cards that cost up to $100 are cheap
// Graphics cards that cost more than $100, up to $200 are mid-range
// Graphics cards that cost more than $200 are expensive

// TODO write code to create a string description "cheap", "mid-range" or "expensive" based on the price of
//  the graphics card variable declared above.  You may use if/else if/else or a when statement.

val description: String = when {
    price <= 100.0 -> "cheap"
    price <= 200.0 -> "mid-range"
    price > 200.0 -> "expensive"
    else -> "Pricing error"
}

// TODO print a message with the price of the graphics card, and the price category name.
//  For example, "The graphics card costs $234.56 and is in the expensive category."
//  You may change the value of the price variable to test your code.

println("The price of the $manufacturer $product is $$price so it is $description.")

/** Functions **/

// TODO write a function that takes two String arguments, and returns a String value.
//  Your function will compare the length of the two Strings, and return the longer string.
//  If the strings are the same length, return the first String.
//  Call your function with some example data to verify it is working correctly.
//  For example, if your function is called with "Albatross" and "Bird" it will return "Albatross" because it has more letters.
//  For example, if your function is called with "Cat" and "Elephant" it will return "Elephant" because it has more letters.
//  For example, if your function is called with "Cat" and "Dog" it will return "Cat" because the two strings
//  have the same number of letters, but "Cat" is the first argument.

fun lengthCompare(string1: String, string2: String): String {
    var answer = ""
    if (string1.length < string2.length)
        println(string2)
    //else if (string1.length > string2.length)
    //  println(string1)
    else {
        (string1.length == string2.length)
        println(string1)
    }
    return answer
}

val stringComparison = lengthCompare("Dog", "Cat")
    println(stringComparison)

/** Lists **/

val androidVersions: MutableList<String> = mutableListOf("Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
    "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "Kitkat", "Lollipop", "Marshmallow",
    "Nougat", "Oreo", "Pie", "Quince Tart", "Red Velvet Cake", "Snow Cone", "Tiramisu")

// TODO add the newest Android version code name to the end of the androidVersions list using code

println(androidVersions)
androidVersions.add("Vanilla Ice Cream")
println(androidVersions)

// TODO read the earliest Android version from the list and print it

println(androidVersions[0])

// TODO read the newest Android version from the list, and print it

println(androidVersions.lastOrNull())

// TODO print the number of Android versions in the list

println(androidVersions.size)


val trees = listOf("Oak", "Pine", "Birch")

// TODO write a comment to explain why the following line is an error
//trees.add("Fir")
// this is not a mutable list, you must be using a mutable list type to add values to the list

// TODO how can you fix this error?

val mutableTrees = mutableListOf("Oak", "Pine", "Birch")
mutableTrees.add("Fir")
println(mutableTrees)

// TODO print the name of each tree, one per line.

for (tree in trees)
    println(tree)

/** Maps **/

val stateTrees = mutableMapOf("Michigan" to "White Pine", "Minnesota" to "Red Pine", "Wisconsin" to "Sugar Maple")

// TODO write a statement to add Iowa's state tree, the "Bur Oak" to the stateTrees map
stateTrees["Iowa"] = "Bur Oak"
println(stateTrees)

// TODO read Minnesota's state tree from the map and print it
println(stateTrees["Minnesota"])

// TODO write code to calculate how many state trees are types of pine tree.
//  In other words, count the number of values in the map that contain the text "Pine".
val v = stateTrees.values
val k = stateTrees.keys

val filteredTreeMap = stateTrees.filterValues { it.endsWith("Pine")}
println(filteredTreeMap)
// source: https://kotlinlang.org/docs/map-operations.html#filter
// source: https://devhints.io/kotlin

println(filteredTreeMap.size)
val numPineTrees = filteredTreeMap.size
println("There are $numPineTrees state trees that are types of Pine tree in this map")


/** Null safety **/

// TODO using the stateTrees map, read California's state tree, and print the name of that tree in uppercase.
//  If that tree is not found in the map, print "No Tree Found".
println(stateTrees.getOrDefault("California".uppercase(), "No Tree Found."))
println(stateTrees["California"]?.uppercase())  // uses null safety operator


// TODO what type of data is returned for the value? Explain why it isn't a String.
// the value returned is null because there is no "California" key within the map stateTrees.
// A string is not returned because while there is a valid mutable map with key-value pairs that
// is a string type, this specific key reference is null.  