package com.example.asyncdemo.factoryPatternDemo

class BikeRider : Rider {
    override fun delivery(): String = "자전거 배달"
    override fun repairBike(): String = "자전거 수리"
}