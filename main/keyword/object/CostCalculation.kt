package main.keyword.`object`

object CostCalculation {
    // You can use any variable or function without creating object by using object keyword
    // Mostly used to store const value or to use util function
    var roomRent = 50
    var pocketCost = 90

    fun getTotalCost(): Int {
        return roomRent+ pocketCost
    }
}