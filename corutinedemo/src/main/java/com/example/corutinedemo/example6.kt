package com.example.corutinedemo

import android.util.Log
import kotlinx.coroutines.*

fun main() = runBlocking {

    async {
        repeat(5) { i ->
            delay(1000)
            println("Coroutine A, $i")
        }
    }

    async{
        repeat(5) { i ->
            println("Coroutine B, $i")
            delay(1000)
        }
    }

    println("Coroutine Outer")
}

// delay의 순서를 바꾼다면 어떻게 될까











































