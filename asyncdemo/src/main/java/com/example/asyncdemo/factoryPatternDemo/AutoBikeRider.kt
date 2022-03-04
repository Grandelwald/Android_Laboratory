package com.example.asyncdemo.factoryPatternDemo

class AutoBikeRider : Rider {
    override fun delivery(): String = "오토바이 배달"
    override fun repairBike(): String = "오토바이 수리"
}