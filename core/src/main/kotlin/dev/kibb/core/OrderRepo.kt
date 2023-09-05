package dev.kibb.core

interface OrderRepo {
    fun insert(order: Order)
}