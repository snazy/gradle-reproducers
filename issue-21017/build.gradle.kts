/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.4.2/samples
 */

plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.apache.iceberg:iceberg-bundled-guava")
}
