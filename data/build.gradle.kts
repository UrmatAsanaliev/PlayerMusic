plugins {
    val plugin = Dependencies.Plugins
    id(plugin.library)
    id(plugin.jetbrainsKotlinAndroid)
}

android {
    val android = Dependencies.Android
    namespace = android.namespaceCore
    compileSdk = android.compileSdk

    defaultConfig {
        minSdk = android.minSdk
        targetSdk =android.targetSdk

        testInstrumentationRunner = android.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(android.proguardAndroidOptimizeTxt),
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
    testImplementation(dep.junit)
    androidTestImplementation(dep.testJunit)
    androidTestImplementation(dep.espresso)
}