plugins {
  alias(libs.plugins.androidApplication).apply(false)
  alias(libs.plugins.androidLibrary).apply(false)
  alias(libs.plugins.kotlinAndroid).apply(false)
  alias(libs.plugins.kotlinMultiplatform).apply(false)
  alias(libs.plugins.kotlinCocoapods).apply(false)
  id("com.squareup.sqldelight") version libs.versions.sqlDelight
  kotlin("jvm") version libs.versions.kotlin
}