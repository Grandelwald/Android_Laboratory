package com.example.asyncdemo.factoryPatternDemo

import java.time.LocalDateTime

class RiderFactory {
    fun createRider(riderName: String): Rider {
        return when (riderName) {
            "autobike" -> AutoBikeRider()
            "bike" -> BikeRider()
            "nighttime" ->
                if (LocalDateTime.now().hour > 21)
                    NightTimeRider()
                else
                    throw IllegalArgumentException("오후 9시 이후만 생성 가능합니다")
            else -> throw IllegalArgumentException("생성할 수 있는 객체명이 아닙니다.")
        }
    }
}