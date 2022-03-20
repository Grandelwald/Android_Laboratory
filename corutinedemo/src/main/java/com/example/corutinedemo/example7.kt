package com.example.corutinedemo

import android.view.ViewTreeObserver
import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(){

    GlobalScope.launch {
        println("Hi coroutine")
        delay(1000)
    }


    println("this is main")
    Thread.sleep(1000L)
}