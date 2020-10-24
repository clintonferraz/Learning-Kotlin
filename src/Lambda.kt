fun main() {

    val printMessage = { message: String -> println(message) }

    printMessage("Hello World!")

    val sumA = { x: Int, y: Int -> x + y }

    printMessage(sumA(3, 9).toString())

    val sumB: (Int, Int) -> Int = { x, y -> x + y }

    printMessage(sumA(7, 3).toString())

    fun downloadData(url: String, completion: () -> Unit) {            //simulation a function that will fetch data from web
        //suppose we sent a download request,
        //got back data,
        //and there were no errors
        completion()
    }
    downloadData("fakeurl.com") {                                    //lambda will only execute after data fetch completion
        println("This message will only show after completion")
    }




    fun downloadCarData(url: String, completion: (Car) -> Unit){
        //suppose we sent a download request,
        //got back data,
        //and there were no errors
        val car = Car("Tesla","Model X","Blue")
        completion(car)
    }

    downloadCarData("fakeurl.com"){ car ->
        println(car.make)
        println(car.model)
        println(car.color)

    }

    downloadCarData("fakeurl.com"){
        println(it.make)
        println(it.model)
        println(it.color)

    }


    fun downloadTruckData(url: String, completion: (truck: Truck?,success: Boolean) -> Unit) {
        //pretend we sent a web request,
        //got back the data
        val webRequestSuccess = true
        if (webRequestSuccess) {
            val truck = Truck ("Ford","F-150",10000) //suppose created using web data
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeurl.com"){ truck, success ->
        if(success){
            truck?.accelerate()
        } else {
            println("Something went wrong!")
        }

    }






}
