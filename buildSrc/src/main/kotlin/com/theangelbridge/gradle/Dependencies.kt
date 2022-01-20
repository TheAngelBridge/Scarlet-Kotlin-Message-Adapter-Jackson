import org.gradle.api.JavaVersion

object Application {
    const val minSdk = 26
    const val targetSdk = 31
    const val compileSdk = 31

    const val versionCode = 1
    const val versionName = "1.0.0"

    const val jvmTarget = "11"
    val targetCompat = JavaVersion.VERSION_11
    val sourceCompat = JavaVersion.VERSION_11
}

object Versions {

    object Essential {
        const val Kotlin = "1.5.31"
        const val Gradle = "7.0.0"
        const val Coroutines = "1.6.0"
        const val AndroidXCore = "1.7.0"
    }

    object Compose {
        const val Activity = "1.4.0"
        const val Core = "1.0.5"
        const val ConstraintLayout = "1.0.0-rc02"
        const val Lifecycle = "2.4.0"
        const val Navigation = "2.4.0-rc01"
        const val DataStore = "1.0.0"
    }

    object Hilt {
        const val Core = "2.40.1"
        const val Hilt = "1.0.0"
        const val ComposeNavigation = "1.0.0-rc01"
    }


    object Network {
        const val OkHttp3 = "4.9.3"
        const val Scarlet = "0.1.12"
    }

    object Util {
        const val Jackson = "2.13.0"
    }
}

object Dependencies {

    val essential = listOf(
        "androidx.core:core-ktx:${Versions.Essential.AndroidXCore}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Essential.Coroutines}"
    )

    val compose = listOf(
        "androidx.compose.ui:ui:${Versions.Compose.Core}",
        "androidx.activity:activity-compose:${Versions.Compose.Activity}",
        "androidx.compose.material:material:${Versions.Compose.Core}",
        "androidx.compose.foundation:foundation:${Versions.Compose.Core}",
        "androidx.compose.foundation:foundation-layout:${Versions.Compose.Core}",
        "androidx.compose.runtime:runtime:${Versions.Compose.Core}",
        "androidx.compose.runtime:runtime-livedata:${Versions.Compose.Core}",
        "androidx.navigation:navigation-compose:${Versions.Compose.Navigation}",
        "androidx.compose.ui:ui-tooling:${Versions.Compose.Core}",
        "androidx.constraintlayout:constraintlayout-compose:${Versions.Compose.ConstraintLayout}"
    )

    val architecture = listOf(
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Compose.Lifecycle}",
    )

    val Jackson = listOf(
        "com.fasterxml.jackson.core:jackson-core:${Versions.Util.Jackson}",
        "com.fasterxml.jackson.core:jackson-databind:${Versions.Util.Jackson}",
        "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.Util.Jackson}"
    )

    const val JacksonUtil = "com.fasterxml.jackson.core:jackson-annotations:${Versions.Util.Jackson}"

    val OkHttp = listOf(
        "com.squareup.okhttp3:okhttp:${Versions.Network.OkHttp3}",
        "com.squareup.okhttp3:logging-interceptor:${Versions.Network.OkHttp3}"
    )

    const val Scarlet = "com.tinder.scarlet:scarlet:${Versions.Network.Scarlet}"

    val ScarletUtil = listOf(
        "com.tinder.scarlet:lifecycle-android:${Versions.Network.Scarlet}",
        "com.tinder.scarlet:stream-adapter-coroutines:${Versions.Network.Scarlet}",
        "com.tinder.scarlet:websocket-okhttp:${Versions.Network.Scarlet}"
    )


    val hilt = listOf(
        "com.google.dagger:hilt-android:${Versions.Hilt.Core}",
        "androidx.hilt:hilt-navigation-compose:${Versions.Hilt.ComposeNavigation}",
    )

    val hiltKapt = listOf(
        "com.google.dagger:hilt-compiler:${Versions.Hilt.Core}",
        "androidx.hilt:hilt-compiler:${Versions.Hilt.Hilt}"
    )
}
