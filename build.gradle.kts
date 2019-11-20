import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(Kotlin.Jvm.plugin) version Kotlin.version
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(Kotlin.stdlib)
    implementation(KotlinX.Coroutines.core)

    testImplementation(JUnit.api)
    testImplementation(MockitoKotlin.core)
    testImplementation(MockkKotlin.core)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}