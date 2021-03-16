package com.suatkkrer.kotlincoroutine

import kotlinx.coroutines.*

fun main(){

   /* GlobalScope.launch {
        myFunction()
    }*/

    runBlocking {
        delay(2000)
        println("run blockckckkckck")
        myFunction()
    }


   // myFunction()   suspend func disinda veya scope disinda cagirilamaz


}

suspend fun myFunction(){
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}