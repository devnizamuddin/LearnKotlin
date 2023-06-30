package main.keyword.`object`

object CostCalculation {

    /** You can use any variable or function without creating object of your desired class.
     * Use object keyword instead of class.
     */

    var roomRent = 50
    var pocketCost = 90

    fun getTotalCost(): Int {
        return roomRent+ pocketCost
    }
}