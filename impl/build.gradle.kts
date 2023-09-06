plugins {
    kotlin("jvm")
}

group = "dev.kibb"

dependencies {
    api(project(":core"))
    implementation(libs.kodein)

    testImplementation(platform(libs.junit.bom))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}