import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {

    implementation(libs.findLibrary("gradle.android").get())
    implementation(libs.findLibrary("gradle.kotlin").get())
}