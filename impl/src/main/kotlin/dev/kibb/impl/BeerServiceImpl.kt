package dev.kibb.impl

import dev.kibb.core.Beer
import dev.kibb.core.BeerService
import dev.kibb.core.Order
import dev.kibb.core.OrderRepo

class BeerServiceImpl(val database: OrderRepo) : BeerService {
    override fun orderBeer(beer: Beer) {
        // go order the beer then store it in the database.
        println("Im ordering a beer")
        database.insert(Order(beer.name, beer.amount))
    }
}