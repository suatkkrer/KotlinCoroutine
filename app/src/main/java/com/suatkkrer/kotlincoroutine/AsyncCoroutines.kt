package com.suatkkrer.kotlincoroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    var userName = ""
    var userAge = 0


    runBlocking {

//        launch {
//            val downloadedName = downloadName()
//            userName = downloadedName
//        }
//        launch {
//            val downloadedAge = downloadAge()
//            userAge = downloadedAge
//        }
//
//        launch {
//            println("${userName} ${userAge}")
//        }

        val downloadedName = async {
            downloadName()
        }

        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")


    }







}

suspend fun downloadName() : String {
    delay(2000)
    val userName = "Asdfasdf: "
    println("username Download")
    return  userName
}

suspend fun downloadAge() : Int {
    delay(4000)
    val userAge = 60
    println("userage download")
    return userAge
}