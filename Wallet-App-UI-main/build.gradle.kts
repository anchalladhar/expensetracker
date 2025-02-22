plugins {
    kotlin("android") version "1.8.0" // Use the appropriate version
}

kotlin {
    android()

    sourceSets {
        val main by getting {
            dependencies {
                implementation(kotlin("stdlib"))
                // Add Android-specific dependencies here
            }
        }
    }
}
