fun main() {
    var name: String = "Clinton"
    //name = null causes an error "Null can not be a value of a non-null type String"

    var nullableName: String? = "Do I really exist?"
    println(nullableName)
    nullableName = null //comment this entire line to see the difference

    //Null check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else{
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    println(nullableName?.length) // with Safe Call Operator (prints the value if not null, or "null" when null)

    val len = nullableName?.length ?: -3 // Elvis Operator (if null, sets len to -3)
    println(len)





}