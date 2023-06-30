package main.keyword

import main.keyword.companion_object.ClassRoom

fun main() {

    // println("Hello World!")

    /**================================================== Key Word ==================================================**/


    /**------------------------object------------------------*/

    /* You can use any variable or function without creating object of your desired class.
     * Use object keyword instead of class.
     */

//    println(CostCalculation.pocketCost)
//    println(CostCalculation.getTotalCost())
//    CostCalculation.pocketCost = 80
//    println(CostCalculation.pocketCost)


    /**-------------------companion object-------------------*/

    /* You can use any variable or function without creating object of your desired class.
     * Use companion object bloc, move your required variable or function into that bloc.
     */

    println("=====Inside companion bloc=====")
    println(ClassRoom.name1)
    println(ClassRoom.getFullName())
    ClassRoom.name1 = "New Companion"
    println(ClassRoom.name1)
    println(ClassRoom.getFullName())

    /* You can create variable and function with same name outside companion object bloc.
     * You will be able to access them with the object of your desired class.
     */

    println("=====Outside companion bloc=====")
    val classRoomObject = ClassRoom()
    println(classRoomObject.name1)
    classRoomObject.name1 = "New Class"
    println(classRoomObject.name1)
    println(classRoomObject.getFullName())


    /* Though companion object is written inside your desired class,
     * You will not able to access your companion object properties through your desired class's object
     * You have to create companion object's object as below
     */

    val companionBloc = ClassRoom.Companion
    // If you give a name to companion then object creation will be like below
    // val companionBloc = ClassRoom.companionName
    println(companionBloc.name1)

    println("=====Random=====")
    classRoomObject.printCompanionPropertiesFromClassLevel()
    companionBloc.printClassLevelPropertiesFromCompanion(classRoomObject)


}