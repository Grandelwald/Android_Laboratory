package com.example.corutinedemo

import android.provider.Settings
import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() = runBlocking {

    val job = launch {
        myWorld()
        printWorld()
        printWorld()
    }
    val job2 = launch {
        printWorld()

    }
    val job3 = launch {
        printWorld()
    }

    repeat(100) {
        launch {
            printWorld()
        }
    }

    println("Hello")
}

suspend fun printWorld(){
    delay(3000L)
    println("World")
}

fun myWorld(){
    println("Hi")
}
    // 동시에 실행될수 있는 코루틴 블록을 만들기위해서는
    //1. 먼저 코루틴 스코프(범위)지정 :
    //  GlobalScope, CoroutineScope, ViewModelScope
    //2. 그다음 코루틴 빌더를 지정 :
    // GlobalScope도 CoroutineScope 인터페이스를 구현한 것
//
//    GlobalScope.launch {
//        delay(1000L) delay는 blocking하지 않고 일시중단 되는 함수
//        println("world!")
//    }
//    println("Hello")
//    Thread.sleep(2000L)

    //thread를 사용하는 것과 coroutine을 사용하는것이 느낌이 비슷하다.
    //Global.launch{} => thread{}
//    thread {
//        Thread.sleep(1000L)
//        println("Wolrd")
//    }
//    println("Hello")
//    Thread.sleep(2000L) sleep은 스레드를 blocking 하는 함수




