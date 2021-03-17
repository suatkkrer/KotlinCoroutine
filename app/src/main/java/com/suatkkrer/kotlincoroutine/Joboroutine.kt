package com.suatkkrer.kotlincoroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){


    runBlocking {
         val myJob = launch {
            delay(2000)
            println("job")
             val secondJob = launch {
                 println("job 2")
             }
        }

        myJob.invokeOnCompletion {
            println("job end")
        }

        myJob.cancel()

    }

}