plugins {
    // apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
    }
}
