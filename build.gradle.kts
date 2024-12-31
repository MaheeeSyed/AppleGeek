// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Update the plugin version to the latest that supports SDK 35
        classpath("com.android.tools.build:gradle:8.5.2")  // Update to a compatible version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        classpath("androidx.compose.compiler:compiler:1.5.1")
    }
}
