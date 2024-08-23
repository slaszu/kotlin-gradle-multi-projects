plugins {
    kotlin("jvm") version "1.9.23"
    id("com.gradleup.shadow") version "8.3.0"
    id("application")
}

group = "pl.slaszu.app"

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
    mainClass = "pl.slaszu.app.MainKt"
}

dependencies {
    implementation(project(":shared"))
}