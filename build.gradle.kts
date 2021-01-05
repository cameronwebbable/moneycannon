buildscript {
    val kotlin_version: String by extra

    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        classpath("com.android.tools.build:gradle:4.1.1")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlin_version")

    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}