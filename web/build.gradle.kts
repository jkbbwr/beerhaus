plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("org.graalvm.buildtools.native") version "0.9.25"

    application
}

group = "dev.kibb"

application {
    mainClass.set("dev.kibb.MainKt")
}

repositories {
    mavenCentral()
    gradlePluginPortal()

}

dependencies {
    implementation(project(":impl"))

    implementation(libs.javalin)
    implementation(libs.jackson)
    implementation(libs.slf4j)
    implementation(libs.kotlinjson)

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}