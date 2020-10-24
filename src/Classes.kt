class CarA constructor(make: String, model: String) {
    val make = make
    val model = model
}

class CarB (val make: String,val model: String) { //other way of doing the same thing (more concise)

}

//class Car (val make: String,val model: String,val color: String) {
//
//    fun accelerate() {
//        println("Vroom")
//    }
//
//    fun details(){
//        println("This is a $color $make $model")
//    }
//
//}
//
//class Truck (val make: String, val model: String, val towingCapacity: Int) {
//
//    fun tow(){
//        println("Taking the horses to the rodeo")
//    }
//
//    fun details(){
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}

open class Vehicle(val make: String, val model: String){ //In kotlin, all classes are final (cannot be inherited from) unless declared as "open"

    open fun accelerate(){ //In order to override a method in a child class, it must be declared open in the parent class
        println("Vroom!")
    }

    fun brake(){
        println("Stop")
    }

}

class Car(make: String, model: String, var color: String) : Vehicle(make, model){ //Use the colon(:) to inherit from other class
    override fun accelerate() {
        println("Silent acceleration")

    //  super.accelerate() //this would call the parent method accelerate, which would allow to print both messages
    }
}

class Truck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model) //If it does not have any classes, you can get rid of the curly brackets


fun main() {
    val tesla = Car("Tesla","ModelS","Silver")

    val ford = Truck("Ford","F-150",10000)

    tesla.accelerate()
    tesla.brake()

    ford.accelerate()
    ford.brake()


//    val car = Car("Toyota","Avalon","White")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford","F-150",10000)
//    truck.tow()
//    truck.details()


}