plugins {
    java
    application
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://nexus.inductiveautomation.com/repository/public/")
    }
}

dependencies {
    implementation("com.inductiveautomation.ignitionsdk:ignition-common:8.1.24")
    implementation("com.inductiveautomation.ignitionsdk:client-api:8.1.24")
}

application {
    mainClass.set("dev.kgamble.IconViewer")
}