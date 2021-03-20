package com.suatkkrer.kotlincoroutine

// retrofit coroutine project will be placed here


fun main(){
    val arrayname = arrayOf<Int>(1, 2, 3, 4, 5)

    println(solveMeFirst(arrayname))
}

fun solveMeFirst(ar: Array<Int>): Int {

    var sum = 0
    for (i in ar) {
        sum += ar[i]
    }

    return sum

}

