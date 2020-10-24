fun main() {
    val imperials = listOf("Emperor","Darth Vader","Boba Fett","Tarkin") //immutable array
    println(imperials)
    println(imperials[1])
    println(imperials.first())
    println(imperials.last())
    println(imperials.sorted()) //sort alphabetically

    println(imperials.contains("Tarkin"))

    val rebels = arrayListOf("Leia", "Luke", "Han Solo")  //mutable
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(1,"Lando") // add in a certain index
    println(rebels)
    println(rebels.indexOf("Han Solo")) // get the index of an element
    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder") // immutable map
    println(rebelVehiclesMap)
    println(rebelVehiclesMap["Luke"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leia","This ship doesn\'t exist"))
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder") //mutable
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leia", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Solo")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles.isEmpty())
}