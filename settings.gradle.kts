pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        // Указываем версию Android Gradle Plugin для приложения и библиотек
        id("com.android.application") version "8.3.0" apply false
        id("com.android.library") version "8.3.0" apply false
        
        // Указываем версию Kotlin (поставьте нужную вам версию)
        id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// Название вашего проекта в корне
rootProject.name = "fpv-simulator-"

// Подключение модулей (по умолчанию это :app)
include(":app")
