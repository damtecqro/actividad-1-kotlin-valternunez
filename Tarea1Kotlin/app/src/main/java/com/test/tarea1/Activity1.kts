package com.test.tarea1

//Valter Nunez A01206138

/*
EJERCICIO 5 - Reverse a LIST

Algorithm

function reverse (int list [])
    int rev []

    rev = apply REVERSE to list

    RETURN rev

*/

fun <Int> reve (list: List<Int>): List<Int> {
    val rev = list.reversed()
    return rev
}


println("EJERCICIO 5 \n")
//TEST CASES
    val list1 = listOf<Int>()
    val rev1 = reve(list1)

    println("El resultado 1 es (expected []) =" + rev1)


    val list2 = listOf(1)
    val rev2 = reve(list2)

    println("El resultado 2 es (expected [1]) =" + rev2)


    val list3 = listOf(1, 1, 2, 3, 5, 8)
    val rev3 = reve(list3)

    println("El resultado 3 es (expected [8, 5, 3, 2, 1, 1) =" + rev3)

    //TEST CASE MIO 1
    val list4 = listOf(44, 55, 66, 77, 88)
    val rev4 = reve(list4)

    println("El resultado 4 es (expected [88, 77, 66, 55, 44]) =" + rev4)

    //TEST CASE MIO 2
    val list5 = listOf(10, 9 , 8 , 7 , 6, 5)
    val rev5 = reve(list5)

    println("El resultado 5 es (expected [5, 6, 7, 8, 9, 10]) =" + rev5)

//END TEST CASES EJERCICIO 5


/*
EJERCICIO 32 - Greatest Common Divisor of 2 integer numbers

Algorithm

function gcd (int a, int b)
    IF (b = 0)
        RETURN a
    ELSE
        RETURN gcd(b, a%b)
*/

println("\n\nEJERCICIO 32 \n")

fun gcd (a: Int, b: Int): Int{
    if (b == 0)
        return a
    else
        return gcd(b, a.rem(b))

}
//TEST CASES

    println("Resultado 1 (expected 1) = " + gcd(1, 2))
    println("Resultado 2 (expected 2) = " + gcd(4, 2))
    println("Resultado 3 (expected 1)= " + gcd(5, 13))
    println("Resultado 4 (expected 9)= " + gcd(36, 63))
    //TEST CASE MIO 1
    println("Resultado 5 (expected 1)= " + gcd(123, 23))
    //TEST CASE MIO 2
    println("Resultado 6 (expected 12)= " + gcd(12, 24))
//END TEST CASES EJERCICIO 32