package dev.kibb.impl

import dev.kibb.core.Order
import dev.kibb.core.OrderRepo

class OrderRepoImpl : OrderRepo {
    // Keeping this stupid simple for now
    private val orders = mutableListOf<Order>()
    override fun insert(order: Order) {
        println("I stored an order in the database")
        orders.add(order)
    }
}