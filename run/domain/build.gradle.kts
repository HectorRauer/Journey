plugins {
    alias(libs.plugins.journey.jvm.library)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(projects.core.domain)
}