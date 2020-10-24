fun main(args: Array<String>) {
    fun function1(){
        println("function1 was called!")
    }
    function1()

    fun function2(line: String){
        println(line)
    }
    function2("Passing a parameter to function 2")

    fun sumNumber(x: Int, y: Int): Int {
        val res = x + y
        return res
    }
    println(sumNumber(3,5))

    fun printMood(mood: String = "angry"){ //setting a default value for a parameter
        println("The mood is \"$mood\"")
    }
    printMood()
    printMood("happy")

}