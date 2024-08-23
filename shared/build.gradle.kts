plugins {
    kotlin("jvm") version "1.9.23"
    id("application")
}

group = "pl.slaszu.shared"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "pl.slaszu.shared.MainKt"
}