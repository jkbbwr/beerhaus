rootProject.name = "beerhaus-parent"
include("core", "web", "impl")

pluginManagement {
    plugins {
        kotlin("jvm") version "1.9.0"
        // for building fat jars
        id("com.github.johnrengelman.shadow") version "8.1.1"
        // graalvm support for native compilation
        id("org.graalvm.buildtools.native") version "0.9.25"
        // dependency hygiene
        id("com.autonomousapps.dependency-analysis") version "1.21.0"
    }

    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    // specify default repository for all modules
    repositories {
        mavenCentral()
    }
    
    versionCatalogs {
        create("libs") {
            library("javalin", "io.javalin:javalin:5.6.1")
            library("slf4j", "org.slf4j:slf4j-simple:2.0.7")
            library("jackson-bom", "com.fasterxml.jackson:jackson-bom:2.15.2")
            library("jackson-databind", "com.fasterxml.jackson.core:jackson-databind:2.15.2")
            library("jackson-kotlin", "com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")
            library("kodein", "org.kodein.di:kodein-di:7.19.0")
            library("junit-bom", "org.junit:junit-bom:5.9.1")
        }
    }
}
