plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
    id("org.graalvm.buildtools.native")

    application
}

group = "dev.kibb"

application {
    mainClass.set("dev.kibb.MainKt")
}

dependencies {
    implementation(project(":impl"))

    implementation(libs.javalin)
    implementation(platform(libs.jackson.bom))
    implementation(libs.jackson.databind)
    implementation(libs.jackson.kotlin)
    implementation(libs.slf4j)
    implementation(libs.kodein)

    testImplementation(platform(libs.junit.bom))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}