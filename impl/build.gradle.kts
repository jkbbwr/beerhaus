plugins {
    kotlin("jvm") version "1.9.10"

}

group = "dev.kibb"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":core"))
    implementation(libs.kodein)

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}