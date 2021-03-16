package com.suatkkrer.kotlincoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness

       /* GlobalScope.launch {
            repeat(100000){
                launch {
                    print("4565464")
                }
            }
        }*/

        //Global Scope, runBlocking, Coroutine Scope

//        runBlocking {     icindeki kod calisana kadar alt satirlarin da calismasini engelliyor
//            launch {
//                println("run run run")
//                delay(5000)
//                println("run run run")
//            }
//        }
//        println("rusdfgsdfgdf")


       /* println("global scope")

        GlobalScope.launch {     alt satirlardaki kodlar calisiyor icindeki kod sonradan geliyor // globalda butun app icersinde calisiyor
                                            Coroutine scopeta istedigin thredi secebiliyorsun


            delay(5000)
            println("global scope")
        }
        println("global scope lolololo")
*/

        /*println("Coroutinsafsafasdfsadfessdafkasjdf")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("Coroutinessdafkasjdf")
        }
        println("sadfasdgfasdf")*/


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
}