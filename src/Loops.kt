fun main() {
    val rebels = arrayListOf("Leia", "Luke", "Han Solo")
    for (rebel in rebels){
        println("Name: $rebel")
    }

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")

    for ((key, value) in rebelVehicles) {
        println("$key gets around in their $value")
    }

    var x = 10
    while (x > 0){
        println(x)
        x--
    }



}