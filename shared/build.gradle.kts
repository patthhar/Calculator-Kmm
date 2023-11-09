plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.androidLibrary)
  kotlin("plugin.serialization") version "1.9.10"
  id("com.squareup.sqldelight")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
              implementation(libs.koin.core)
              implementation(libs.koin.test)
              implementation(libs.kotlinx.coroutines.core)
              implementation(libs.ktor.client.core)
              implementation(libs.ktor.client.content.negotiation)
              implementation(libs.ktor.serialization.kotlinx.json)
              implementation(libs.sqlDelight.runtime)
              implementation(libs.sqlDelight.coroutinesExt)
              implementation(libs.kotlinx.datetime)

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
      val androidMain by getting {
        dependencies {
          implementation(libs.ktor.client.android)
          implementation(libs.sqlDelight.android)
        }
      }
      val iosMain by getting {
        dependencies {
          implementation(libs.ktor.client.ios)
          implementation(libs.sqlDelight.native)
        }
      }
      val jvmMain by creating {
        dependencies {
          implementation(libs.sqlDelight.jvm)
        }
      }
    }
}

android {
    namespace = "me.darthwithap.kmm.calculator"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}