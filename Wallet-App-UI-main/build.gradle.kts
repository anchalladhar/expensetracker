plugins {
    kotlin("multiplatform") version "1.8.0" // Use the appropriate version
}

kotlin {
    android()
    ios() // You can add other targets like iosX64, iosArm64, etc.

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
                // Add common dependencies here
            }
        }
        val androidMain by getting {
            dependencies {
                // Android-specific dependencies
            }
        }
        val iosMain by getting {
            dependencies {
                // iOS-specific dependencies
            }
        }
    }
}
