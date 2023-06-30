package main.keyword.companion_object

class ClassRoom {

    /** You can use any variable or function without creating object of your desired class.
     *  Use companion object bloc, move your required variable or function into that bloc.
     */
    companion object {
        // You can declare companion with a name like companion object Dhaka {}
        // Same name variable as class level is possible.
        var name1 = "Nizam"
        var name2 = "Uddin"
        var name3 = "Shamrat"

        // For checking access from class level
        var companionLevelName = "Miraz"

        /** Though companion object is written inside this class,
         *  You will not able to access class properties directly
         *  You have to create companion object's object as below
         */

        fun printClassLevelPropertiesFromCompanion(classRoom: ClassRoom) {
            println(classRoom.classLevelName)
        }

        fun getFullName(): String {
            return "$name1 $name2 $name3"
        }
    }

    /** companion object Other {} will give you ERROR
     *  only one companion object is allowed per class
     */


    var name1 = "Shakil"
    var name2 = "Mostafa"
    var name3 = "Sikder"

    // for checking access from companion object
    var classLevelName = "Nahid"


    fun getFullName(): String {
        return "$name1 $name2 $name3"
    }

    fun printCompanionPropertiesFromClassLevel() {
        /** You can access properties from companion object directly if they are not same named.
         *  To use variable with the same name you have to create object of your companion
         */
        println(companionLevelName)
        val companion = Companion
        // If you give a name to companion then object creation will be like below
        // val companionBloc = companionName
        println(companion.name1)
    }
}


