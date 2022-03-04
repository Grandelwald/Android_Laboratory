package com.example.asyncdemo.factoryPatternDemo

class DeliveryService {
    private var riderFactory = RiderFactory()

    fun assignDelivery() {
        val rider = riderFactory.createRider("autobike")
        rider.delivery()
    }
}