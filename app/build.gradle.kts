plugins {
    val plugin = Dependencies.Plugins
    id(plugin.application)
    id(plugin.jetbrainsKotlinAndroid)
}

android {
    val android = Dependencies.Android
    namespace = android.namespace
    compileSdk = android.compileSdk

    defaultConfig {
        applicationId = android.applicationId
        minSdk = android.minSdk
        targetSdk = android.targetSdk
        versionCode = android.versionCode
        versionName = android.versionName

        testInstrumentationRunner = android.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(
                    android.proguardAndroidOptimizeTxt
                ),
                android.proguardRulesPro
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = android.jvmTarget
    }
}

dependencies {

    val dep = Dependencies.Ui

    //UI
    implementation(dep.coreKtx)
    implementation(dep.appCompat)
    implementation(dep.material)
    implementation(dep.constraint)
    testImplementation(dep.junit)
    androidTestImplementation(dep.testJunit)
    androidTestImplementation(dep.espresso)
}