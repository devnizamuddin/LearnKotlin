package main.logic

fun main() {
    val whenKeyword = WhenKeyword()
    println(whenKeyword.getCurrentDay(5))
}

class WhenKeyword {
    /** Kotlin provides when keyword instead of switch case in other languages
     * It uses else keyword instead of default.
     */
    fun getCurrentDay(day: Int): String {
        val result = when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day."
        }
        return result;
    }
}