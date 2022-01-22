plugins {
    id("common-jetpack-library")
}

dependencies {
    implementation(libs.jetpackCompose.material3)
    implementation(libs.jetpackCompose.uiTooling.preview)
    debugImplementation(libs.jetpackCompose.uiTooling)
}