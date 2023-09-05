rootProject.name = "beerhaus-parent"
include("core", "web", "impl")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("javalin", "io.javalin:javalin:5.6.1")
            library("slf4j", "org.slf4j:slf4j-simple:2.0.7")
            library("jackson", "com.fasterxml.jackson.core:jackson-databind:2.15.0")
            library("kotlinjson", "com.fasterxml.jackson.module:jackson-module-kotlin:2.15.+")
            library("kodein", "org.kodein.di:kodein-di:7.19.0")
        }
    }
}
