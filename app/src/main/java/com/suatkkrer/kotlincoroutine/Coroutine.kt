package com.suatkkrer.kotlincoroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

        runBlocking {
            launch {
                delay(5000)
                println("runblockkkk")
            }

            coroutineScope {
                launch {
                    delay(3000)
                    println("scope")
                }
            }

        }

    }