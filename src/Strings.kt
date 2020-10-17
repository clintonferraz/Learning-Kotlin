fun main(args: Array<String>) {


    val str = "This is a example of a string."
    println(str)

    val y: Int = 8
    println(y.toString()) //convert other types to String

    val str1 = "Quotation marks inside of a string: \"Example\"  \'Example\'"
    println(str1)

    println("New \nline")
    println("\tTab a line")
    println("Backspace\b")
    println("Remove every\rthing before")
    println("Print dollar sign \$")

    val rawString = """ |Example of a
        |multiline
        | string""".trimMargin()  //use trimMargin to trim the left margin where the default "|" symbol appears
    println(rawString)

    val rawString2 = """ çExample of a
        çmultiline
        ç string""".trimMargin( marginPrefix = "ç" )  //change the default symbol used as reference
    println(rawString2)

    val str3 = "test"
    for (x in str3) {
        println(x) //prints each character in a different line
    }

    var contentEquals = str3.contentEquals("test") //tests if two strings are the same
    println("contentEquals = $contentEquals")
    contentEquals = str3.contentEquals("test1")
    println("contentEquals = $contentEquals")

    val contains = str.contains("eXaMple", true) //tests if a string contains other, use true to ignore case or false to match exactly
    println("Contains = $contains")

    val uppercase = str.toUpperCase()
    println(uppercase)
    val lowercase = str.toLowerCase()
    println(lowercase)

    val subsequence1 = str.subSequence(0, 4) //str = "This is a example of a string."
    val subsequence2 = str.subSequence(1, 3) //Cut a string (first char, last char +1)
    println(subsequence1)
    println(subsequence2)

    val name = "Clinton"
    println("The name $name has ${name.length} characters.") //String length

}