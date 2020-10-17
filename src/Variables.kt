fun main(args: Array<String>) {
    val name = "Clinton" //variable name is immutable (declared with 'val')
    var isAwesome = false
    isAwesome = true //variable isAwesome is mutable (declared with 'var')

    println("Is " + name + " awesome?")
    println("The answer is: " + isAwesome)

    var a = 4
    var b = 3
    println(a + b)

    val doubleNum = 123.45 //the default decimal numbers are double (64 bit number)
    val floatNum = 123.45f //to specify a float, put a 'f' at the end (32 bit number)

    val longNum = 12345678489494L //64 bit

    val aDouble = a.toDouble() //converting variable 'a' to a double
    val aString: String = a.toString() //explicitly setting the type of a variable




}
