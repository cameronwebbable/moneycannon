pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "Blahblah"

enableFeaturePreview("GRADLE_METADATA")

include(":androidApp")
include(":shared")

