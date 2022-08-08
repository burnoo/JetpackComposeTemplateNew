plugins {
    id("common-jetpack-library")
}

dependencies {
    implementation(project(":design"))
    implementation(libs.jetpackCompose.material3)
    implementation(libs.jetpackCompose.navigation)
    implementation(libs.jetpackCompose.uiTooling.preview)
    debugImplementation(libs.jetpackCompose.uiTooling)
}