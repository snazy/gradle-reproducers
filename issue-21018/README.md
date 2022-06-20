

1. Run `setup.sh` (just a `git clone`)
2. Run `./gradlew :iceberg:iceberg-nessie:dependencies --configuration runtimeClasspath`
   --> OK
3. Run `./gradlew dependencies --configuration runtimeClasspath`
   --> Dependency resolution fails! (Error messages copied from IntelliJ's Gradle sync)
   ```
   iceberg:iceberg-gcp:test: Could not find com.google.cloud:google-cloud-storage:.
   Required by:
       project :iceberg:iceberg-gcp

   iceberg:iceberg-gcp:test: Could not find com.google.cloud:google-cloud-nio:.
   Required by:
       project :iceberg:iceberg-gcp

   iceberg:iceberg-gcp:main: Could not find com.google.cloud:google-cloud-storage:.
   Required by:
       project :iceberg:iceberg-gcp
   ```
