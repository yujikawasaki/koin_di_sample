import dependencies.versions.oss

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.kmmapplication.android"
    compileSdk = 32
    defaultConfig {
        applicationId = "com.example.kmmapplication.android"
        minSdk = 29
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}


dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.2.1")
    implementation("androidx.compose.ui:ui-tooling:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.compose.foundation:foundation:1.2.1")
    implementation("androidx.compose.material:material:1.2.1")
    implementation("androidx.activity:activity-compose:1.5.1")

//    implementation("io.insert-koin:koin-android:${oss.koin_android_version}")
    implementation("io.insert-koin:koin-android-compat:${oss.koin_android_version}")
//    implementation("io.insert-koin:koin-androidx-workmanager:${oss.koin_android_version}")
//    implementation("io.insert-koin:koin-androidx-compose:${oss.koin_android_version}")
}