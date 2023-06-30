package main.data_type.primitive

fun main() {

    /**=============================================== All Primitives ===============================================**/


    /**-------------------------Byte-------------------------*/

    /* 16 bits  | -32,768 to 32,767 | Signed integer */

    val byteValue: Byte = 127
    println(byteValue)


    /**------------------------Short------------------------*/

    /* 8 bits | -128 to 127 | Signed integer */

    val shortValue: Short = 32767
    println(shortValue)


    /**-------------------------Int-------------------------*/

    /* 32 bits | -2,147,483,648 to 2,147,483,647 | Signed integer */

    val intValue: Int = 2147483647
    println(intValue)

    /**-------------------------Long-------------------------*/

    /* 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | Signed integer */

    val longValue: Long = 9223372036854775807
    println(longValue)

    /**------------------------Float------------------------*/

    /* 32 bits | ±1.4E-45 to ±3.4028235E38 | Floating-point number */

    val floatValue: Float = 3.1415f
    println(floatValue)

    /**------------------------Double------------------------*/

    /* 64 bits | ±4.9E-324 to ±1.7976931348623157E308 | Floating-point number */

    val doubleValue: Double = 1.7976931348623157E308
    println(doubleValue)

    /**-------------------------Char-------------------------*/

    /* 16 bits | 0 to 65,535 | Unicode character */

    val charValue: Char = 'A'
    println(charValue)

    /**-----------------------Boolean-----------------------*/

    /* 1 bit | true or false | Boolean value */

    val booleanValue: Boolean = true
    println(booleanValue)

}