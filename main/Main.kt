package main

import main.keyword.`object`.CostCalculation

fun main() {

    // println("Hello World!")

    /**================================================== Key Word ==================================================**/


    /**------------------------ object ------------------------*/

    /* You can use any variable or function without creating object of your desired class.
     * Use object keyword instead of class.
     */

    println(CostCalculation.pocketCost)
    println(CostCalculation.getTotalCost())
    CostCalculation.pocketCost = 80
    println(CostCalculation.pocketCost)

}