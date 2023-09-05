package dev.kibb

import dev.kibb.core.Beer
import dev.kibb.core.BeerService
import dev.kibb.impl.module
import io.javalin.Javalin
import io.javalin.http.Context
import io.javalin.http.bodyAsClass
import org.kodein.di.DI
import org.kodein.di.instance

data class BeerRequest(val name: String, val amount: Int)

fun orderBeer(ctx: Context) {
    val di = ctx.appAttribute<DI>("di")
    val beerService by di.instance<BeerService>()
    val request = ctx.bodyAsClass<BeerRequest>()
    beerService.orderBeer(Beer(request.name, request.amount))
    ctx.result("Done")
}

fun main() {
    val di = DI {
        import(module)
    }

    val app = Javalin.create()
        .attribute("di", di)
        .post("/order", ::orderBeer)
        .start(7070)
}