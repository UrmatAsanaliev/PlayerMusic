object Dependencies {

    object Plugins {
        const val library = "com.android.library"
        const val application = "com.android.application"
        const val jetbrainsKotlinAndroid = "org.jetbrains.kotlin.android"
    }

    object Android {
        const val namespaceCore = "com.example.core"
        const val namespace = "com.example.playermusic"
        const val compileSdk = 33
        const val applicationId = "com.example.playermusic"
        const val minSdk = 26
        const val targetSdk = 33
        const val versionCode = 1
        const val versionName = "1.0"
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val proguardAndroidOptimizeTxt = "proguard-android-optimize.txt"
        const val proguardRulesPro = "proguard-rules.pro"
        const val jvmTarget = "1.8"
    }

    object Ui {
        const val coreKtx = "androidx.core:core-ktx:1.8.0"
        const val appCompat = "androidx.appcompat:appcompat:1.6.1"
        const val material = "com.google.android.material:material:1.5.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val junit = "junit:junit:4.13.2"
        const val testJunit = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
    }

    object Coroutines {

    }

    object DaggerHilt {

    }

    object Glide {

    }

    object Lifecycle {

    }

    object Navigation {

    }

}