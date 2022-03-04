package com.example.asyncdemo.factoryPatternDemo

class NightTimeRider : Rider {
    override fun delivery(): String = "야간 배달"
    override fun repairBike(): String = "야간 수리 "
}