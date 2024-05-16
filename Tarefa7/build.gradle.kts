plugins {
    java
    application
}

application {
    mainClass = "Main"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
