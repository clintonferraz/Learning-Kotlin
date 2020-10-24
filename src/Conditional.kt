fun main() {
    var a = 5
    var b = 5
// relational operators == != > < >= <=
// logical operators && || !
    if (a == b && a > 4){
        println("a is equal to b and bigger than 4")
    } else {
        println("the condition was not met")
    }

    var x = 3
    when (x) {
        1 -> println("x = 1")
        2 -> println("x = 2")
        3 -> println("x = 3")
        else -> println("x is not equal to 1 or 2 or 3")
    }

}