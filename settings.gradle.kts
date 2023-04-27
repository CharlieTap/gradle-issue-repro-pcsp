pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    includeBuild("gradle/plugins/versions-conventions")
}

plugins {
    id("com.gradle.enterprise") version ("3.3.4")
}

gradleEnterprise {
    // configuration
    buildScan {

        // Connecting to scans.gradle.com by agreeing to the terms of service
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"

        // Publishing a build scan for every build execution
        publishAlways()
    }
}

rootProject.name = "reproducer-project"
