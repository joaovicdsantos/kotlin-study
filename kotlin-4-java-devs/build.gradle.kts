import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
}

group = "br.com.joaovicdsantos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jcenter.bintray.com")
}

dependencies {
    implementation("org.funktionale:funktionale-all:1.2")
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.7.22")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    testImplementation("org.amshove.kluent:kluent:1.72")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}