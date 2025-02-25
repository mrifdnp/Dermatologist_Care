plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.dermatologistcare"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.dermatologistcare"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"

            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        viewBinding = true
        buildConfig = true
        mlModelBinding = true
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.ui.viewbinding)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.core.splashscreen)
    implementation(libs.tensorflow.lite.support)
    implementation(libs.tensorflow.lite.metadata)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Jetpack Compose Integration/NAVIGATION
    implementation (libs.androidx.navigation.compose)
    implementation (libs.androidx.runtime.livedata)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)


    implementation (libs.androidx.animation)

    //location
    implementation (libs.play.services.location)
    implementation (libs.accompanist.permissions)
    implementation (libs.kotlinx.coroutines.play.services)
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation (libs.kotlinx.coroutines.play.services)


    implementation (libs.androidx.camera.core)
    implementation (libs.androidx.camera.lifecycle)
    implementation (libs.androidx.camera.view)

    implementation (libs.androidx.camera.core.v140)
    implementation (libs.androidx.camera.camera2)
    implementation (libs.androidx.camera.lifecycle)
    implementation (libs.androidx.camera.view.v140)


//splash screen

    implementation(libs.androidx.core.splashscreen.v100)

    implementation (libs.ucrop)

    implementation (libs.androidx.fragment.ktx)
    implementation (libs.androidx.appcompat)

    // Google Maps
    implementation("com.google.android.gms:play-services-maps:18.0.2") // Untuk Google Play Services Maps
    implementation("com.google.maps.android:maps-compose:2.11.0") // Untuk Jetpack Compose dengan Maps
    implementation("com.google.maps.android:android-maps-utils:2.2.0") // Untuk Maps Utilities
    implementation("com.google.maps.android:maps-ktx:3.3.0") // Untuk Maps KTX

    implementation (libs.androidx.material.icons.extended)




    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")


    implementation (libs.androidx.room.runtime)

    // Room testing (optional)
    testImplementation (libs.room.testing)

    // Coroutine support for Room (optional, but recommended if you use coroutines)
    implementation (libs.room.ktx)

    implementation ("androidx.compose.runtime:runtime-livedata:1.4.0")

    implementation (libs.ktor.client.core.v230)
    implementation (libs.ktor.client.android.v230)
    implementation (libs.ktor.client.content.negotiation) // For ContentNegotiation
    implementation (libs.ktor.serialization.kotlinx.json)  // For JSON serialization
    implementation (libs.kotlinx.serialization.json.v151) // Kotlinx serialization




        implementation ("org.tensorflow:tensorflow-lite:2.13.0")
        implementation ("org.tensorflow:tensorflow-lite-support:0.4.3")
        implementation ("org.tensorflow:tensorflow-lite-metadata:0.4.3")
        implementation ("org.tensorflow:tensorflow-lite-task-vision:0.4.3")




}
