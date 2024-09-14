plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.exprnc.cspredictions"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.seleniumhq.selenium:selenium-java:4.23.0")
    implementation("com.alibaba.fastjson2:fastjson2:2.0.52")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0-RC")
    implementation("org.jsoup:jsoup:1.18.1")
    implementation("com.google.firebase:firebase-admin:9.3.0")
    implementation("ch.qos.logback:logback-classic:1.5.7")
    implementation("com.google.code.gson:gson:2.11.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

sourceSets["main"].java.srcDirs("src/main/kotlin")