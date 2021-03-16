package com.suatkkrer.kotlincoroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){


    // Dispatchers.Default -> CPU INTENSIVE
    // Dispatchers.IO -> Input Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited dispatcher


    runBlocking {
        launch(Dispatchers.Main) {
            println("MainThread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            println("IOThread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default) {
            println("DefaultThread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Unconfined) {
            println("UnconfinedThread: ${Thread.currentThread().name}")
        }
    }

}