// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.45")
        classpath("com.android.tools.build:gradle")
    }
}
plugins {
    id(Plugin.AGP.application) version Versions.AGP apply false
    id(Plugin.AGP.library) version Versions.AGP apply false
    id(Plugin.Kotlin.android) version Versions.kotlin apply false
    id(Plugin.DaggerHilt.hilt) version Versions.DaggerHilt apply false
    id(Plugin.Kotlin.jwm) version Versions.kotlinJwm apply false

}