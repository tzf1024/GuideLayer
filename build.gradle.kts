// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}

allprojects {
    group = providers.gradleProperty("GROUP").orNull ?: "io.github.your_github"
    version = providers.gradleProperty("VERSION_NAME").orNull ?: "0.1.0-SNAPSHOT"
}