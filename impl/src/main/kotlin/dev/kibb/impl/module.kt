package dev.kibb.impl

import dev.kibb.core.BeerService
import dev.kibb.core.OrderRepo
import org.kodein.di.DI
import org.kodein.di.*

val module = DI.Module("beerhaus-details") {
    bindSingleton<OrderRepo> {
        OrderRepoImpl()
    }

    bindProvider<BeerService> {
        BeerServiceImpl(instance())
    }
}