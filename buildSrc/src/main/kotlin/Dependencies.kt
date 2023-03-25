object Plugin {

    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val javaLibrary = "java-library"
        const val jetbrainsKotlin = "org.jetbrains.kotlin.jvm"
    }

    object Kotlin {
        const val android = "org.jetbrains.kotlin.android"
        const val jwm = "org.jetbrains.kotlin.jvm"
        const val kapt = "kotlin-kapt"
    }

    object DaggerHilt {
        const val hilt = "com.google.dagger.hilt.android"
    }

    object NavArgs {
        const val navArgs = "androidx.navigation.safeargs"
    }
}

object Dependencies {
    object UI {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacy}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val lifeCycleLiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveDataLC}"
        const val lifeCycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModelLC}"

    }

    object Room {
        const val roomRuntime = "androidx.room:room-runtime:${Versions.roomRuntime}"
        const val room = "androidx.room:room-ktx:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.roomCompiler}"
    }

    object EspressoUnit {
        const val jUnite = "junit:junit:${Versions.jUnite}"
        const val test = "androidx.test.ext:junit:${Versions.test}"
        const val testEspresso = "androidx.test.espresso:espresso-core:${Versions.testEspresso}"
    }

    object Navigation {
        const val navFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navFragment}"
        const val navUI = "androidx.navigation:navigation-ui-ktx:${Versions.navUI}"
    }

    object ReflectionBasedFlavor {
        const val viewBinding =
            "com.github.kirich1409:viewbindingpropertydelegate-full:${Versions.viewBinding}"
    }

    object Coroutine {
        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object Hilt {


        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hiltCompiler}"
    }
}

object Versions {
    const val core = "1.7.0"
    const val appcompat = "1.6.1"
    const val material = "1.8.0"
    const val constraint = "2.1.4"
    const val legacy = "1.0.0"
    const val fragment = "1.5.5"

    //LC= liveCycle
    private const val versionOfLC = "2.5.1"
    const val liveDataLC = versionOfLC
    const val viewModelLC = versionOfLC

    //room
    private const val versionOfRoom = "2.5.0"
    const val roomRuntime = versionOfRoom
    const val room = versionOfRoom
    const val roomCompiler = versionOfRoom

    //DI Hilt
    private const val versionOfHilt = "2.45"
    const val hilt = versionOfHilt
    const val hiltCompiler = versionOfHilt

    //Coroutine
    const val coroutines = "1.6.4"

    // reflection-based flavor
    const val viewBinding = "1.5.8"

    //navigation
    private const val versionOfNav = "2.5.3"
    const val navFragment = versionOfNav
    const val navUI = versionOfNav

    //espresso unit
    const val jUnite = "4.13.2"
    const val test = "1.1.5"
    const val testEspresso = "3.5.1"

    // AGP = application gradle plugins
    const val AGP = "7.3.1"

    //Kotlin.android
    const val kotlin = "1.7.20"

    //DaggerHilt.hilt
    const val DaggerHilt = "2.45"

    //Kotlin.jwm
    const val kotlinJwm = "1.7.20"


}
