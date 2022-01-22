@file:Suppress("UnstableApiUsage")

import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

plugins {
    id("common-android-library")
}

val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

android {
    composeOptions {
        kotlinCompilerExtensionVersion = libs.findVersion("jetpackComposeCompiler").get().toString()
    }

    buildFeatures {
        compose = true
    }
}

kotlin.sourceSets.all {
    languageSettings.optIn("kotlin.RequiresOptIn")
    languageSettings.optIn("androidx.compose.material3.ExperimentalMaterial3Api")
}