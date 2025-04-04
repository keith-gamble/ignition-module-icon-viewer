plugins {
    java
    application
}

repositories {
    maven {
        url = uri("https://nexus.inductiveautomation.com/repository/public/")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    val version = "8.1.24"
    implementation(group = "com.inductiveautomation.ignitionsdk", name = "ignition-common", version = version)
    implementation(group = "com.inductiveautomation.ignitionsdk", name = "client-api", version = version)
}

application {
    mainClass.set("com.inductiveautomation.ignition.client.icons.VectorIcons")
}
